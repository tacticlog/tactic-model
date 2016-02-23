package com.tacticlogistics.crm.model.hibernate.query;

import java.util.List;

import org.hibernate.CacheMode;
import org.hibernate.Query;
import org.hibernate.Session;

public class QueryByHQL extends QueryBase {

    public QueryByHQL(boolean cacheable, int maxResult, CacheMode cacheMode) {
        super(cacheable, maxResult, cacheMode);
    }

    public <Model> Model getObject(Session session, String hqlQuery) {
        return getObject(session.createQuery(hqlQuery));
    }

    public <Model> List<Model> getList(Session session, String hqlQuery) {
        return getList(session.createQuery(hqlQuery));
    }

    public int execute(Session session, String hqlQuery) {
        Query query = session.createQuery(hqlQuery);
        return query.executeUpdate();
    }

}
