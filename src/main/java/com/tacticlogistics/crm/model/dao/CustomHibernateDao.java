/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tacticlogistics.crm.model.dao;

/**
 *
 * @author CSARMIENTO
 */
import com.tacticlogistics.crm.model.hibernate.criteria.HibernateOrder;
import com.tacticlogistics.crm.model.hibernate.criteria.HibernateProjection;
import com.tacticlogistics.crm.model.hibernate.criteria.HibernateRestriction;
import com.tacticlogistics.crm.model.criteria.hibernate.enums.HibernateOperationEnum;
import com.tacticlogistics.crm.model.hibernate.query.QueryByHQL;
import com.tacticlogistics.crm.model.hibernate.query.QueryByRQL;
import com.tacticlogistics.crm.model.hibernate.query.QueryBySQL;
import com.tacticlogistics.crm.model.hibernate.query.QueryDefinedSQL;
import com.tacticlogistics.crm.model.hibernate.util.NotNullNotEmptyPropertySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.CacheMode;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example.PropertySelector;
import org.hibernate.criterion.MatchMode;
import org.hibernate.transform.ResultTransformer;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CustomHibernateDao implements ICustomHibernateDao {

    @Resource
    private SessionFactory sessionFactory;

    private static final PropertySelector QUERY_PROPERTY_SELECTOR = new NotNullNotEmptyPropertySelector();
    private static final ResultTransformer QUERY_RESULT_TRANSFORMER = Criteria.DISTINCT_ROOT_ENTITY;
    private static final CacheMode QUERY_CACHE_MODE = CacheMode.NORMAL;
    private static final int QUERY_MAX_RESULT = Integer.MAX_VALUE;
    private static final boolean QUERY_CACHEABLE = true;

    /**
     *
     */
    protected QueryBySQL queryBySQL;

    /**
     *
     */
    protected QueryByHQL queryByHQL;

    /**
     *
     */
    protected QueryByRQL queryByRQL;

    /**
     *
     */
    protected QueryDefinedSQL queryDefinedSQL;

    /**
     * Constructor
     */
    public CustomHibernateDao() {
        queryBySQL = new QueryBySQL(QUERY_CACHEABLE, QUERY_MAX_RESULT, QUERY_CACHE_MODE);
        queryByHQL = new QueryByHQL(QUERY_CACHEABLE, QUERY_MAX_RESULT, QUERY_CACHE_MODE);
        queryByRQL = new QueryByRQL(QUERY_CACHEABLE, QUERY_MAX_RESULT, QUERY_CACHE_MODE, QUERY_PROPERTY_SELECTOR, QUERY_RESULT_TRANSFORMER);
        queryDefinedSQL = new QueryDefinedSQL(QUERY_CACHEABLE, QUERY_MAX_RESULT, QUERY_CACHE_MODE);
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getCurrentSession() {
        return getSessionFactory().getCurrentSession();
    }

    /**
     *
     * @param object
     * @param operation
     */
    private void operation(Object object, HibernateOperationEnum operation) {
        switch (operation) {
            case SAVE:
                getCurrentSession().save(object);
                break;
            case SAVE_FLUSH:
                getCurrentSession().save(object);
                getCurrentSession().flush();
                getCurrentSession().refresh(object);
                break;
            case UPDATE:
                getCurrentSession().update(object);
                break;
            case DELETE:
                getCurrentSession().delete(object);
                break;
            case SAVEORUPDATE:
                getCurrentSession().saveOrUpdate(object);
                break;
            case MERGE:
                getCurrentSession().merge(object);
                break;
            default:
                break;
        }
    }

    /**
     *
     * @param object
     * @throws Exception
     */
    @Transactional
    @Override
    public void save(Object object) throws Exception {
        operation(object, HibernateOperationEnum.SAVE);
    }

    /**
     *
     * @param object
     * @throws Exception
     */
    @Transactional
    @Override
    public void saveFlushing(Object object) throws Exception {
        operation(object, HibernateOperationEnum.SAVE_FLUSH);
    }

    /**
     *
     * @param object
     * @throws Exception
     */
    @Transactional
    @Override
    public void update(Object object) throws Exception {
        operation(object, HibernateOperationEnum.UPDATE);
    }

    /**
     *
     * @param object
     * @throws Exception
     */
    @Transactional
    @Override
    public void delete(Object object) throws Exception {
        operation(object, HibernateOperationEnum.DELETE);
    }

    /**
     *
     * @param object
     * @throws Exception
     */
    @Transactional
    @Override
    public void saveOrUpdate(Object object) throws Exception {
        operation(object, HibernateOperationEnum.SAVEORUPDATE);
    }

    /**
     *
     * @param object
     * @throws Exception
     */
    @Transactional
    @Override
    public void merge(Object object) throws Exception {
        operation(object, HibernateOperationEnum.MERGE);
    }

    /**
     *
     * @param <Model>
     * @param sqlQuery
     * @param clazz
     * @return
     * @throws Exception
     */
    @Transactional
    @Override
    public <Model> Model getSQLObject(final String sqlQuery, final Class<Model> clazz) throws Exception {
        return queryBySQL.getObject(this.getCurrentSession(), sqlQuery, clazz);
    }

    /**
     *
     * @param <Model>
     * @param sqlQuery
     * @param clazz
     * @return
     * @throws Exception
     */
    @Transactional
    @Override
    public <Model> List<Model> getSQLList(final String sqlQuery, final Class<Model> clazz) throws Exception {
        return queryBySQL.getList(this.getCurrentSession(), sqlQuery, clazz);
    }

    /**
     *
     * @param <Model>
     * @param hqlQuery
     * @return
     * @throws Exception
     */
    @Transactional
    @Override
    public <Model> Model getHQLObject(final String hqlQuery) throws Exception {
        return queryByHQL.getObject(this.getCurrentSession(), hqlQuery);
    }

    /**
     *
     * @param <Model>
     * @param hqlQuery
     * @return
     * @throws Exception
     */
    @Transactional
    @Override
    public <Model> List<Model> getHQLList(final String hqlQuery) throws Exception {
        return queryByHQL.getList(this.getCurrentSession(), hqlQuery);
    }

    /**
     *
     * @param <Model>
     * @param object
     * @return
     * @throws Exception
     */
    @Transactional
    @Override
    public <Model> Model getRQLObject(final Model object) throws Exception {
        return queryByRQL.getObject(this.getCurrentSession(), object, MatchMode.EXACT, null, null, null);
    }

    /**
     *
     * @param <Model>
     * @param hqlQuery
     * @return
     * @throws Exception
     */
    @Transactional
    @Override
    public int execute(final String hqlQuery) throws Exception {
        return queryByHQL.execute(this.getCurrentSession(), hqlQuery);
    }

    /**
     *
     * @param <Model>
     * @param object
     * @param likeType
     * @return
     * @throws Exception
     */
    @Transactional
    @Override
    public <Model> Model getRQLObject(final Model object, final MatchMode likeType) throws Exception {
        return queryByRQL.getObject(this.getCurrentSession(), object, likeType, null, null, null);
    }

    /**
     *
     * @param <Model>
     * @param object
     * @param restriction
     * @return
     * @throws Exception
     */
    @Transactional
    @Override
    public <Model> Model getRQLObject(final Model object, final HibernateRestriction restriction) throws Exception {
        List<HibernateRestriction> restrictionList = new ArrayList<>();
        if (restriction != null) {
            restrictionList.add(restriction);
        }
        return queryByRQL.getObject(this.getCurrentSession(), object, MatchMode.EXACT, null, restrictionList, null);
    }

    /**
     *
     * @param <Model>
     * @param object
     * @param conditionOrderList
     * @return
     * @throws Exception
     */
    @Transactional
    @Override
    public <Model> Model getRQLObject(final Model object, final List<HibernateOrder> conditionOrderList) throws Exception {
        return queryByRQL.getObject(this.getCurrentSession(), object, MatchMode.EXACT, null, null, conditionOrderList);
    }

    /**
     *
     * @param <Model>
     * @param object
     * @param conditionCriteriaList
     * @param conditionOrderList
     * @return
     * @throws Exception
     */
    @Transactional
    @Override
    public <Model> Model getRQLObject(final Model object, final List<HibernateRestriction> conditionCriteriaList,
            final List<HibernateOrder> conditionOrderList) throws Exception {
        return queryByRQL.getObject(this.getCurrentSession(), object, MatchMode.EXACT, null, conditionCriteriaList, conditionOrderList);
    }

    /**
     *
     * @param <Model>
     * @param object
     * @param projectionList
     * @param restrictionList
     * @param orderList
     * @return
     * @throws Exception
     */
    @Transactional
    @Override
    public <Model> Model getRQLObject(final Model object, final List<HibernateProjection> projectionList,
            final List<HibernateRestriction> restrictionList, final List<HibernateOrder> orderList) throws Exception {
        return queryByRQL.getObject(this.getCurrentSession(), object, MatchMode.EXACT, projectionList, restrictionList, orderList);
    }

    @Transactional
    @Override
    public <Model> Model getRQLObject(final Model object, final HibernateProjection projection,
            final HibernateRestriction restriction) throws Exception {
        List<HibernateProjection> projectionList = new ArrayList<>();
        if (projection != null) {
            projectionList.add(projection);
        }

        List<HibernateRestriction> restrictionList = new ArrayList<>();
        if (restriction != null) {
            restrictionList.add(restriction);
        }

        return queryByRQL.getObject(this.getCurrentSession(), object, MatchMode.EXACT, projectionList, restrictionList, null);
    }

    /**
     *
     * @param <Model>
     * @param object
     * @return
     * @throws Exception
     */
    @Transactional
    @Override
    public <Model> List<Model> getRQLList(final Model object) throws Exception {
        return queryByRQL.getList(this.getCurrentSession(), object, MatchMode.START, null, null, null);
    }

    /**
     *
     * @param <Model>
     * @param object
     * @param likeType
     * @return
     * @throws Exception
     */
    @Transactional
    @Override
    public <Model> List<Model> getRQLList(final Model object, final MatchMode likeType) throws Exception {
        return queryByRQL.getList(this.getCurrentSession(), object, likeType, null, null, null);
    }

    /**
     *
     * @param <Model>
     * @param object
     * @param likeType
     * @param conditionCriteriaList
     * @param conditionOrderList
     * @return
     * @throws Exception
     */
    @Transactional
    @Override
    public <Model> List<Model> getRQLList(final Model object, final MatchMode likeType,
            final List<HibernateRestriction> conditionCriteriaList,
            final List<HibernateOrder> conditionOrderList) throws Exception {
        return queryByRQL.getList(this.getCurrentSession(), object, likeType, null, conditionCriteriaList, conditionOrderList);
    }

    /**
     *
     * @param <Model>
     * @param object
     * @param projectionList
     * @param restrictionList
     * @param orderList
     * @return
     * @throws Exception
     */
    @Transactional
    @Override
    public <Model> List<Model> getRQLList(final Model object, final List<HibernateProjection> projectionList,
            final List<HibernateRestriction> restrictionList, final List<HibernateOrder> orderList)
            throws Exception {
        return queryByRQL.getList(this.getCurrentSession(), object, MatchMode.START, projectionList, restrictionList, orderList);
    }

    /**
     *
     * @param <Model>
     * @param object
     * @param conditionCriteriaList
     * @param conditionOrderList
     * @return
     * @throws Exception
     */
    @Transactional
    @Override
    public <Model> List<Model> getRQLList(final Model object, final List<HibernateRestriction> conditionCriteriaList,
            final List<HibernateOrder> conditionOrderList)
            throws Exception {
        return queryByRQL.getList(this.getCurrentSession(), object, MatchMode.START, null, conditionCriteriaList, conditionOrderList);
    }

    /**
     *
     * @param <Model>
     * @param object
     * @param conditionOrderList
     * @return
     * @throws Exception
     */
    @Transactional
    @Override
    public <Model> List<Model> getRQLList(final Model object, final List<HibernateOrder> conditionOrderList) throws Exception {
        return queryByRQL.getList(this.getCurrentSession(), object, MatchMode.START, null, null, conditionOrderList);
    }

    /**
     *
     * @param <Model>
     * @param object
     * @param restriction
     * @return
     * @throws Exception
     */
    @Transactional
    @Override
    public <Model> List<Model> getRQLList(final Model object, final HibernateRestriction restriction) throws Exception {
        List<HibernateRestriction> restrictionList = new ArrayList<>();
        if (restriction != null) {
            restrictionList.add(restriction);
        }

        return queryByRQL.getList(this.getCurrentSession(), object, MatchMode.START, null, restrictionList, null);
    }

    /**
     *
     * @param <Model>
     * @param object
     * @param restriction
     * @param order
     * @return
     * @throws Exception
     */
    @Transactional
    @Override
    public <Model> List<Model> getRQLList(final Model object, final HibernateRestriction restriction,
            final HibernateOrder order) throws Exception {
        List<HibernateRestriction> restrictionList = new ArrayList<>();
        if (restriction != null) {
            restrictionList.add(restriction);
        }

        List<HibernateOrder> orderList = new ArrayList<>();
        if (order != null) {
            orderList.add(order);
        }

        return queryByRQL.getList(this.getCurrentSession(), object, MatchMode.START, null, restrictionList, orderList);
    }

    /**
     *
     * @param <Model>
     * @param object
     * @param order
     * @return
     * @throws Exception
     */
    @Transactional
    @Override
    public <Model> List<Model> getRQLList(final Model object, final HibernateOrder order) throws Exception {
        List<HibernateOrder> orderList = new ArrayList<>();
        if (order != null) {
            orderList.add(order);
        }

        return queryByRQL.getList(this.getCurrentSession(), object, MatchMode.START, null, null, orderList);
    }

    /**
     *
     * @param <Model>
     * @param object
     * @param likeType
     * @param restriction
     * @param order
     * @return
     * @throws Exception
     */
    @Transactional
    @Override
    public <Model> List<Model> getRQLList(final Model object, final MatchMode likeType, final HibernateRestriction restriction,
            final HibernateOrder order) throws Exception {
        List<HibernateRestriction> restrictionList = new ArrayList<>();
        if (restriction != null) {
            restrictionList.add(restriction);
        }

        List<HibernateOrder> orderList = new ArrayList<>();
        if (order != null) {
            orderList.add(order);
        }

        return queryByRQL.getList(this.getCurrentSession(), object, likeType, null, restrictionList, orderList);
    }

    /**
     *
     * @param <Model>
     * @param parameters
     * @param clazz
     * @return
     * @throws Exception
     */
    @Transactional
    @Override
    public <Model> Model getDefinedSQLObject(final List<Object> parameters, final Class<Model> clazz) throws Exception {
        return queryDefinedSQL.getObject(this.getCurrentSession(), parameters, clazz);
    }

    /**
     *
     * @param <Model>
     * @param parameters
     * @param clazz
     * @return
     * @throws Exception
     */
    @Transactional
    @Override
    public <Model> List<Model> getDefinedSQLList(final List<Object> parameters, final Class<Model> clazz) throws Exception {
        return queryDefinedSQL.getList(this.getCurrentSession(), parameters, clazz);
    }

    /**
     *
     * @param <Model>
     * @param parameters
     * @param clazz
     * @return
     * @throws Exception
     */
    @Transactional
    @Override
    public <Model> List<Model> getDefinedSQLList(final Map<String, Object> parameters, final Class<Model> clazz) throws Exception {
        return queryDefinedSQL.getList(this.getCurrentSession(), parameters, clazz);
    }

}
