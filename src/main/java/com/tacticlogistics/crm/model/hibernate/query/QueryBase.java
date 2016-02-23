package com.tacticlogistics.crm.model.hibernate.query;

import java.util.List;

import org.hibernate.CacheMode;
import org.hibernate.Query;

public abstract class QueryBase {

    protected CacheMode cacheMode;
    protected int maxResult;
    protected boolean cacheable;

    public QueryBase(boolean cacheable, int maxResult, CacheMode cacheMode) {
        this.cacheable = cacheable;
        this.maxResult = maxResult;
        this.cacheMode = cacheMode;
    }

    @SuppressWarnings("unchecked")
    protected <Model> Model getObject(Query query) {
        if (maxResult != Integer.MAX_VALUE) {
            query.setMaxResults(maxResult);
        }
        query.setCacheable(cacheable);
        query.setCacheMode(cacheMode);
        return (Model) query.uniqueResult();
    }

    @SuppressWarnings("unchecked")
    protected <Model> List<Model> getList(Query query) {
        if (maxResult != Integer.MAX_VALUE) {
            query.setMaxResults(maxResult);
        }
        query.setCacheable(cacheable);
        query.setCacheMode(cacheMode);
        return query.list();
    }

}
