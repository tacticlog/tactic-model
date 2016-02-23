package com.tacticlogistics.crm.model.hibernate.query;

import java.util.List;

import org.hibernate.CacheMode;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Example.PropertySelector;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.ResultTransformer;

import com.tacticlogistics.crm.model.hibernate.criteria.HibernateOrder;
import com.tacticlogistics.crm.model.hibernate.criteria.HibernateProjection;
import com.tacticlogistics.crm.model.hibernate.criteria.HibernateRestriction;
import com.tacticlogistics.crm.model.hibernate.util.MethodValue;
import com.tacticlogistics.crm.model.util.ReflectionUtil;

public class QueryByRQL extends QueryBase {

    /**
     *
     */
    private final ResultTransformer resultTransformer;

    /**
     *
     */
    private final PropertySelector propertySelector;

    /**
     *
     * @param cacheable
     * @param maxResult
     * @param cacheMode
     * @param propertySelector
     * @param resultTransformer
     */
    public QueryByRQL(boolean cacheable, int maxResult, CacheMode cacheMode, PropertySelector propertySelector, ResultTransformer resultTransformer) {
        super(cacheable, maxResult, cacheMode);
        this.propertySelector = propertySelector;
        this.resultTransformer = resultTransformer;
    }

    /**
     *
     * @param <Model>
     * @param session
     * @param object
     * @param likeType
     * @param hibernateProyectionList
     * @param restrictionList
     * @param orderList
     * @return
     */
    public <Model> Model getObject(Session session, Model object, MatchMode likeType, List<HibernateProjection> hibernateProyectionList, List<HibernateRestriction> restrictionList, List<HibernateOrder> orderList) {
        List<Model> list = getList(session, object, likeType, hibernateProyectionList, restrictionList, orderList);
        if (!list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    /**
     *
     * @param <Model>
     * @param session
     * @param object
     * @param likeType
     * @param proyectionList
     * @param restrictionList
     * @param orderList
     * @return
     */
    @SuppressWarnings("unchecked")
    public <Model> List<Model> getList(Session session, Model object, MatchMode likeType, List<HibernateProjection> proyectionList,
            List<HibernateRestriction> restrictionList, List<HibernateOrder> orderList) {
        Criteria query = session.createCriteria(object.getClass());
        if (ReflectionUtil.getIdValue(object, query) == null) {
            Example example = Example.create(object);
            example = example.enableLike(likeType);
            example = example.ignoreCase();
            example = example.setPropertySelector(propertySelector);
            query = query.add(example);
            createConditions(query, object, likeType);
        }

        addProjections(query, proyectionList);
        addRestrictions(query, restrictionList);
        addOrders(query, orderList);

        if (maxResult != Integer.MAX_VALUE) {
            query.setMaxResults(maxResult);
        }
        query.setCacheable(cacheable);
        query.setCacheMode(cacheMode);
        query.setResultTransformer(resultTransformer);
        return query.list();
    }

    /**
     *
     * @param query
     * @param object
     * @param likeType
     * @return
     */
    private Criteria createConditions(Criteria query, Object object, MatchMode likeType) {
        for (MethodValue other : ReflectionUtil.getEntities(object)) {
            Criteria query2 = query.createCriteria(other.getField());
            if (ReflectionUtil.getIdValue(other.getValue(), query2) == null) {
                query2.add(Example.create(other.getValue()).enableLike(likeType).ignoreCase());
                createConditions(query2, other.getValue(), likeType);
            }
        }
        return query;
    }

    /**
     *
     * @param query
     * @param projectionList
     */
    private void addProjections(Criteria query, List<HibernateProjection> projectionList) {
        if (projectionList != null && projectionList.size() > 0) {
            projectionList.stream().forEach((projection) -> {
                query.setProjection(Projections.projectionList().add(projection.getProjection()));
            });
        }
    }

    /**
     *
     * @param query
     * @param restrictionList
     */
    private void addRestrictions(Criteria query, List<HibernateRestriction> restrictionList) {
        if (restrictionList != null && restrictionList.size() > 0) {
            if (restrictionList.size() > 1) {
                for (int i = 0; i < restrictionList.size() - 1; i++) {
                    HibernateRestriction restriction = restrictionList.get(i);
                    switch (restriction.getLogicalOperator()) {
                        case HibernateRestriction.AND:
                            query.add(Restrictions.and(restriction.getRestriction(), restrictionList.get(i + 1).getRestriction()));
                            break;
                        case HibernateRestriction.OR:
                            query.add(Restrictions.or(restriction.getRestriction(), restrictionList.get(i + 1).getRestriction()));
                            break;
                    }
                }
            } else {
                query.add(restrictionList.get(0).getRestriction());
            }
        }
    }

    /**
     *
     * @param query
     * @param orderList
     */
    private void addOrders(Criteria query, List<HibernateOrder> orderList) {
        if (orderList != null && orderList.size() > 0) {
            orderList.stream().forEach((order) -> {
                query.addOrder(order.getOrder());
            });
        }
    }

}
