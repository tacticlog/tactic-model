package com.tacticlogistics.crm.model.hibernate.query;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

import org.hibernate.CacheMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.annotations.NamedNativeQuery;

public class QueryDefinedSQL extends QueryBase {

    public QueryDefinedSQL(boolean cacheable, int maxResult, CacheMode cacheMode) {
        super(cacheable, maxResult, cacheMode);
    }

    public <Model> Model getObject(Session session, List<Object> parameters, Class<Model> clazz) {
        List<Model> list;
        Model other;

        list = getList(session, parameters, clazz);
        other = null;
        if (!list.isEmpty()) {
            other = list.get(0);
        }
        return other;
    }

    public <Model> List<Model> getList(Session session, List<Object> parameters, Class<Model> clazz) {
        Query query;

        query = session.getNamedQuery(getSQLName(clazz));
        if (parameters != null) {
            for (int i = 0; i < parameters.size(); i++) {
                Object tmpObject = parameters.get(i);
                if (tmpObject != null) {
                    Class<?> objectClass = tmpObject.getClass();
                    if (objectClass.isArray()) {
                        query.setParameterList(new String("" + i), (Object[]) tmpObject);
                    } else {
                        query.setParameter(i, tmpObject);
                    }
                } else {
                    query.setParameter(i, tmpObject);
                }
            }
        }
        return getList(query);
    }

    public <Model> List<Model> getList(Session session, Map<String, Object> parameters, Class<Model> clazz) {
        Query query;

        query = session.getNamedQuery(getSQLName(clazz));

        if (parameters != null) {
            for (String key : parameters.keySet()) {
                Object tmpObject = parameters.get(key);
                if (tmpObject != null) {
                    Class<?> objectClass = tmpObject.getClass();
                    if (objectClass.isArray()) {
                        query.setParameterList(key, (Object[]) tmpObject);
                    } else {
                        query.setParameter(key, tmpObject);
                    }
                } else {
                    query.setParameter(key, tmpObject);
                }

            }
        }
        return getList(query);
    }

    private String getSQLName(Class<?> clazz) {
        for (Annotation annotation : clazz.getAnnotations()) {
            if (annotation instanceof NamedNativeQuery) {
                return ((NamedNativeQuery) annotation).name();
            }
        }
        return null;
    }

}
