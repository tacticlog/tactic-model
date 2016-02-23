package com.tacticlogistics.crm.model.hibernate.criteria;

import com.tacticlogistics.crm.model.criteria.hibernate.enums.HibernateRestrictionEnum;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

public final class HibernateRestriction {

    public static final byte AND = 1;
    public static final byte OR = 2;

    private String field;
    private HibernateRestrictionEnum expression;
    private Object[] value;
    private byte logicalOperator;

    /**
     * Constructor por defecto.
     */
    public HibernateRestriction() {
    }

    public HibernateRestriction(HibernateRestrictionEnum expression, String field) {
        setField(field);
        setExpression(expression);
    }

    public HibernateRestriction(HibernateRestrictionEnum expression, String field, Object value) {
        setField(field);
        setExpression(expression);
        setValue(value);
    }

    public HibernateRestriction(HibernateRestrictionEnum expression, String field, Object[] value) {
        setField(field);
        setExpression(expression);
        setValue(value);
    }

    public HibernateRestriction(HibernateRestrictionEnum expression, String field, Object value, byte logicalOperator) {
        setField(field);
        setExpression(expression);
        setValue(value);
        setLogicalOperator(logicalOperator);
    }

    public HibernateRestriction(HibernateRestrictionEnum expression, String field, Object[] value, byte logicalOperator) {
        setField(field);
        setExpression(expression);
        setValue(value);
        setLogicalOperator(logicalOperator);
    }

    /**
     * Asigna el valor al campo de la condici�n.
     *
     * @param field
     */
    public void setField(String field) {
        this.field = field;
    }

    /**
     * Asigna el valor con el que se va a comparar el campo de la condici�n.
     *
     * @param value
     */
    public void setValue(Object[] value) {
        this.value = value;
    }

    /**
     * Asigna el valor con el que se va a comparar el campo de la condici�n.
     *
     * @param value
     */
    public void setValue(Object value) {
        Object[] object = {value};
        this.value = object;
    }

    /**
     * Asigna el operador con que se va a comparar el valor con el campo de la
     * expresi�n.
     *
     * @param expression
     */
    public void setExpression(HibernateRestrictionEnum expression) {
        this.expression = expression;
    }

    /**
     * Asigna el operador logico con que se va a concatenar la siguiente
     * expresi�n.
     *
     * @param logicalOperator
     */
    public void setLogicalOperator(byte logicalOperator) {
        this.logicalOperator = logicalOperator;
    }

    /**
     * Devuelve el operador logico con que se va a concatenar la siguiente
     * expresi�n.
     *
     * @return
     */
    public byte getLogicalOperator() {
        return logicalOperator;
    }

    /**
     *
     * @return
     */
    public Criterion getRestriction() {
        switch (expression) {
            case IS_NOT_NULL:
                return Restrictions.isNotNull(field);
            case IS_NULL:
                return Restrictions.isNull(field);
            case IS_NOT_EMPTY:
                return Restrictions.isNotEmpty(field);
            case IS_EMPTY:
                return Restrictions.isEmpty(field);
            case EQUALS:
                return Restrictions.eq(field, value[0]);
            case EQUALS_IGNORE_CASE:
                return Restrictions.eq(field, value[0]).ignoreCase();
            case DIFFERENT:
                return Restrictions.ne(field, value[0]);
            case LIKE_ANYWHERE:
                return Restrictions.ilike(field, value[0].toString(), MatchMode.ANYWHERE);
            case LIKE_START:
                return Restrictions.ilike(field, value[0].toString(), MatchMode.START);
            case LIKE_END:
                return Restrictions.ilike(field, value[0].toString(), MatchMode.END);
            case NOT_LIKE_ANYWHERE:
                return Restrictions.not(Restrictions.like(field, value[0].toString(), MatchMode.ANYWHERE));
            case NOT_LIKE_START:
                return Restrictions.not(Restrictions.like(field, value[0].toString(), MatchMode.START));
            case NOT_LIKE_END:
                return Restrictions.not(Restrictions.like(field, value[0].toString(), MatchMode.END));
            case IN:
                return Restrictions.in(field, value);
            case BETWEEN:
                return Restrictions.between(field, value[0], value[1]);
            case GREATER_THAN:
                return Restrictions.gt(field, value[0]);
            case GREATER_EQUALS_THAN:
                return Restrictions.ge(field, value[0]);
            case LESS_THAN:
                return Restrictions.lt(field, value[0]);
            case LESS_EQUALS_THAN:
                return Restrictions.le(field, value[0]);
            default:
                return null;
        }
    }

}
