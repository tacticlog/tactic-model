package com.tacticlogistics.crm.model.hibernate.util;

public class MethodId {

    public static String TYPE_ID = "ID";
    public static String TYPE_EMBEDDED = "EMBEDDED";

    private String IdType;
    private String methodName;
    private Class<?> clazz;

    public MethodId() {
    }

    public String getIdType() {
        return IdType;
    }

    public void setIdType(String idType) {
        IdType = idType;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public void setClazz(Class<?> clazz) {
        this.clazz = clazz;
    }

}
