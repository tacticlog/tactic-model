package com.tacticlogistics.crm.model.hibernate.criteria;

import org.hibernate.criterion.Order;

import com.tacticlogistics.crm.model.criteria.hibernate.enums.HibernateOrderEnum;

public class HibernateOrder {

    /**
     *
     */
    private final String value;

    /**
     *
     */
    private final HibernateOrderEnum order;

    /**
     *
     * @param value
     * @param order
     */
    public HibernateOrder(String value, HibernateOrderEnum order) {
        this.value = value;
        this.order = order;
    }

    /**
     *
     * @return
     */
    public Order getOrder() {
        switch (order) {
            case ASC:
                return Order.asc(value);
            case DESC:
                return Order.desc(value);
            default:
                return null;
        }
    }

}
