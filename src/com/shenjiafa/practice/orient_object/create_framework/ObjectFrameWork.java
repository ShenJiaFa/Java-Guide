package com.shenjiafa.practice.orient_object.create_framework;

import com.shenjiafa.practice.orient_object.create_framework.model.Teacher;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Function: Generic Call Object Method Framework
 *
 * @author ShenJiaFa
 * @since 2022/7/5
 */
public class ObjectFrameWork {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Properties properties = new Properties();
        ClassLoader classLoader = ObjectFrameWork.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("com/shenjiafa/practice/orient_object/create_framework/model.properties");
        properties.load(is);

        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

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
