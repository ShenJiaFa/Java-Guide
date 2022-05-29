package com.shenjiafa.theory.reflect.method;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Function: Get method
 *
 * @author ShenJiaFa
 * @since 2022/5/28
 */
public class GetMethod {

    @Test
    public void TestGetDeclaredMethods(){
        Class dogClass=Dog.class;
        Method[] methods = dogClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName()+" || Return type: "+method.getReturnType()+"|| Parameter count: "+method.getParameterCount());
        }
    }

    @Test
    public void TestGetDeclaredMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Class dogClass=Dog.class;
        Method method1 = dogClass.getDeclaredMethod("eat");
        Method method2 = dogClass.getDeclaredMethod("eat",String.class);

        // Invoke method1 of dog
        Dog dog=new Dog();
        method1.invoke(dog);

        // Invoke method2 of dog
        Object res = method2.invoke(dog, "Apple");
        System.out.println(res);

    }

}
