package com.tacticlogistics.crm.model.hibernate.criteria;

import com.tacticlogistics.crm.model.criteria.hibernate.enums.HibernateProjectionEnum;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

public class HibernateProjection {

    /**
     *
     */
    private String field;

    /**
     *
     */
    private HibernateProjectionEnum expression;

    /**
     *
     * @param expression
     */
    public HibernateProjection(HibernateProjectionEnum expression) {
        if (expression == HibernateProjectionEnum.COUNT) {
            this.expression = expression;
        }
    }

    /**
     *
     * @param expression
     * @param field
     */
    public HibernateProjection(HibernateProjectionEnum expression, String field) {
        this.expression = expression;
        this.field = field;
    }

    public Projection getProjection() {
        switch (expression) {
            case COUNT:
                return Projections.rowCount();
            case COUNT_FIELD:
                return Projections.count(field);
            case COUNT_DISTINCT:
                return Projections.countDistinct(field);
            case AVG:
                return Projections.avg(field);
            case SUM:
                return Projections.sum(field);
            case MAX:
                return Projections.max(field);
            case MIN:
                return Projections.min(field);
            default:
                return null;
        }
    }

}
