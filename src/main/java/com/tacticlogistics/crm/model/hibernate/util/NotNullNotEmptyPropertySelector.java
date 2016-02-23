package com.tacticlogistics.crm.model.hibernate.util;

import org.hibernate.criterion.Example.PropertySelector;
import org.hibernate.type.Type;

public final class NotNullNotEmptyPropertySelector implements PropertySelector {

    private static final long serialVersionUID = 1L;

    @Override
    public boolean include(Object object, String propertyName, Type type) {
        return (object != null && !object.toString().trim().equals(""));
    }

}
