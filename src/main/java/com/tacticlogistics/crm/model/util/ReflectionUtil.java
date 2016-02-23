package com.tacticlogistics.crm.model.util;

import com.tacticlogistics.crm.model.hibernate.util.MethodId;
import com.tacticlogistics.crm.model.hibernate.util.MethodValue;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class ReflectionUtil {

    /**
     *
     * @param aClass
     * @return
     */
    public static MethodId getMethodId(Class<?> aClass) {
        MethodId methodId = new MethodId();
        String methodName;
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            Annotation[] annotations = method.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof javax.persistence.Id) {
                    methodName = method.getName();
                    methodId.setIdType(MethodId.TYPE_ID);
                    methodId.setMethodName(methodName);
                    methodId.setClazz(method.getReturnType());
                } else if (annotation instanceof javax.persistence.EmbeddedId) {
                    methodName = method.getName();
                    methodId.setIdType(MethodId.TYPE_EMBEDDED);
                    methodId.setMethodName(methodName);
                    methodId.setClazz(method.getReturnType());
                }
            }
        }

        return methodId;
    }

    /**
     *
     * @param object
     * @return
     */
    public static List<MethodValue> getEntities(Object object) {
        List<MethodValue> list = new LinkedList<>();
        Method[] methods = object.getClass().getMethods();
        for (Method method : methods) {
            Annotation[] annotations = method.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof javax.persistence.ManyToOne) {
                    MethodValue other = new MethodValue();
                    other.setField(getFieldName(method.getName()));
                    other.setValue(getMethodValue(object, method.getName()));
                    if (other.getValue() != null) {
                        list.add(other);
                    }
                }
            }
        }

        return list;
    }

    /**
     *
     * @param object
     * @return
     */
    public static List<MethodValue> getMethods(Object object) {
        List<MethodValue> list = new LinkedList<>();
        String methodName;
        Method[] methods = object.getClass().getMethods();
        for (Method method : methods) {
            Annotation[] annotations = method.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof javax.persistence.Column) {
                    MethodValue other = new MethodValue();
                    methodName = method.getName();
                    other.setValue(getMethodValue(object, methodName));
                    if (other.getValue() != null) {
                        other.setField(getFieldName(methodName));
                        list.add(other);
                    }
                }
            }
        }

        return list;
    }

    /**
     *
     * @param object
     * @param query
     * @return
     */
    public static Object getIdValue(Object object, Criteria query) {
        MethodId methodId = ReflectionUtil.getMethodId(object.getClass());
        String methodName = methodId.getMethodName();
        Object id = ReflectionUtil.getMethodValue(object, methodName);
        if (id != null) {
            if (methodId.getIdType().equals(MethodId.TYPE_ID)) {
                query.add(Restrictions.eq(ReflectionUtil.getFieldName(methodName), id));
            } else {
                ReflectionUtil.getMethods(id).stream().forEach((methodValue) -> {
                    query.add(Restrictions.eq(ReflectionUtil.getFieldName(methodName) + "." + methodValue.getField(),
                            ReflectionUtil.getMethodValue(id, ReflectionUtil.getMethodName(methodValue.getField(), true))));
                });
            }
        }
        return id;
    }

    /**
     *
     * @param object
     * @param methodName
     * @return
     */
    public static Object getMethodValue(Object object, String methodName) {
        Object other;
        try {
            other = object.getClass().getMethod(methodName).invoke(object, new Object[]{});
        } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            other = null;
        }
        return other;
    }

    /**
     *
     * @param methodName
     * @return
     */
    public static String getFieldName(String methodName) {
        String fieldName = methodName.substring(3, methodName.length());
        fieldName = fieldName.substring(0, 1).toLowerCase() + fieldName.substring(1, fieldName.length());
        return fieldName;
    }

    /**
     *
     * @param property
     * @param isGet
     * @return
     */
    public static String getMethodName(String property, boolean isGet) {
        String method = property.substring(0, 1).toUpperCase() + property.substring(1);
        if (isGet) {
            method = "get" + method;
        } else {
            method = "set" + method;
        }
        return method;
    }

}
