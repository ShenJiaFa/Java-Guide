package com.shenjiafa.practice.orient_object.create_framework.use_annotation;

import com.shenjiafa.practice.orient_object.create_framework.common_model.Teacher;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Function: Generic Call Object Method Framework
 *
 * @author ShenJiaFa
 * @since 2022/7/5
 */
@ObjectMethod(className = "com.shenjiafa.practice.orient_object.create_framework.common_model.Student", methodName = "studentSelfIntroduction")
public class ObjectFrameWork {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        ObjectMethod objectMethod = ObjectFrameWork.class.getAnnotation(ObjectMethod.class);

        String className = objectMethod.className();
        String methodName = objectMethod.methodName();

        Class clazz = Class.forName(className);

        Object obj = clazz.newInstance();
        Method method = clazz.getMethod(methodName, String.class, int.class, String.class);

        if (obj instanceof Teacher) {
            method.invoke(obj, "Bill", 38, "Shanghai No. 1 Middle School");
        } else {
            method.invoke(obj, "Jim", 18, "Shanghai No. 1 Middle School");
        }

    }
}
