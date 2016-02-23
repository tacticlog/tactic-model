package com.tacticlogistics.crm.model.hibernate.query;

import java.util.List;

import org.hibernate.CacheMode;
import org.hibernate.Query;
import org.hibernate.Session;

public class QueryBySQL extends QueryBase {

    public QueryBySQL(boolean cacheable, int maxResult, CacheMode cacheMode) {
        super(cacheable, maxResult, cacheMode);
    }

    public <Model> Model getObject(Session session, String sqlQuery, Class<?> c) {
        Query query;
        if (c != null) {
            query = session.createSQLQuery(sqlQuery).addEntity(c);
        } else {
            query = session.createSQLQuery(sqlQuery);
        }
        return getObject(query);
    }

    public <Model> List<Model> getList(Session session, String sqlQuery, Class<?> c) {
        Query query;
        query = session.createSQLQuery(sqlQuery).addEntity(c);
        return getList(query);
    }

    public <Model> Model getObject(Session session, String sqlQuery) {
        return getObject(session, sqlQuery, null);
    }

}
