package com.tacticlogistics.crm.model.criteria.hibernate.enums;

public enum HibernateRestrictionEnum {

	IS_NULL,
	IS_NOT_NULL,
	IS_EMPTY,
	IS_NOT_EMPTY,
	EQUALS,
	EQUALS_IGNORE_CASE,
	DIFFERENT,
	GREATER_THAN,
	GREATER_EQUALS_THAN,
	LESS_THAN,
	LESS_EQUALS_THAN,
	LIKE_ANYWHERE,
	LIKE_START,
	LIKE_END,
	NOT_LIKE_ANYWHERE,
	NOT_LIKE_START,
	NOT_LIKE_END,
	BETWEEN,
	IN;	
	
}