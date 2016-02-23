/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tacticlogistics.crm.model.dao;

import com.tacticlogistics.crm.model.hibernate.criteria.HibernateOrder;
import com.tacticlogistics.crm.model.hibernate.criteria.HibernateProjection;
import com.tacticlogistics.crm.model.hibernate.criteria.HibernateRestriction;
import java.util.List;
import java.util.Map;
import org.hibernate.criterion.MatchMode;

/**
 *
 * @author CSARMIENTO
 */
public interface ICustomHibernateDao {

    public void save(Object object) throws Exception;

    public void saveFlushing(Object object) throws Exception;

    public void update(Object object) throws Exception;

    public void delete(Object object) throws Exception;

    public void saveOrUpdate(Object object) throws Exception;

    public void merge(Object object) throws Exception;

    public <Model> Model getSQLObject(final String sqlQuery, final Class<Model> clazz) throws Exception;

    public <Model> List<Model> getSQLList(final String sqlQuery, final Class<Model> clazz) throws Exception;

    public <Model> Model getHQLObject(final String hqlQuery) throws Exception;

    public <Model> List<Model> getHQLList(final String hqlQuery) throws Exception;

    public int execute(final String hqlQuery) throws Exception;

    public <Model> Model getRQLObject(final Model object) throws Exception;

    public <Model> Model getRQLObject(final Model object, final MatchMode likeType) throws Exception;

    public <Model> Model getRQLObject(final Model object, final HibernateRestriction restriction) throws Exception;

    public <Model> Model getRQLObject(final Model object, final List<HibernateOrder> conditionOrderList) throws Exception;

    public <Model> Model getRQLObject(final Model object, final List<HibernateRestriction> conditionCriteriaList,
            final List<HibernateOrder> conditionOrderList) throws Exception;

    public <Model> Model getRQLObject(final Model object, final List<HibernateProjection> projectionList,
            final List<HibernateRestriction> restrictionList, final List<HibernateOrder> orderList) throws Exception;

    public <Model> Model getRQLObject(final Model object, final HibernateProjection projection,
            final HibernateRestriction restriction) throws Exception;

    public <Model> List<Model> getRQLList(final Model object) throws Exception;

    public <Model> List<Model> getRQLList(final Model object, final MatchMode likeType) throws Exception;

    public <Model> List<Model> getRQLList(final Model object, final MatchMode likeType,
            final List<HibernateRestriction> conditionCriteriaList,
            final List<HibernateOrder> conditionOrderList) throws Exception;

    public <Model> List<Model> getRQLList(final Model object, final List<HibernateProjection> projectionList,
            final List<HibernateRestriction> restrictionList, final List<HibernateOrder> orderList)
            throws Exception;

    public <Model> List<Model> getRQLList(final Model object, final List<HibernateRestriction> conditionCriteriaList,
            final List<HibernateOrder> conditionOrderList) throws Exception;

    public <Model> List<Model> getRQLList(final Model object, final List<HibernateOrder> conditionOrderList) throws Exception;

    public <Model> List<Model> getRQLList(final Model object, final HibernateRestriction restriction) throws Exception;

    public <Model> List<Model> getRQLList(final Model object, final HibernateRestriction restriction,
            final HibernateOrder order) throws Exception;

    public <Model> List<Model> getRQLList(final Model object, final HibernateOrder order) throws Exception;

    public <Model> List<Model> getRQLList(final Model object, final MatchMode likeType, final HibernateRestriction restriction,
            final HibernateOrder order) throws Exception;

    public <Model> Model getDefinedSQLObject(final List<Object> parameters, final Class<Model> clazz) throws Exception;

    public <Model> List<Model> getDefinedSQLList(final List<Object> parameters, final Class<Model> clazz) throws Exception;

    public <Model> List<Model> getDefinedSQLList(final Map<String, Object> parameters, final Class<Model> clazz) throws Exception;

}
