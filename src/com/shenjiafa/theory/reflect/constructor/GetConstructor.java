package com.shenjiafa.theory.reflect.constructor;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Function: Get constructor
 *
 * @author ShenJiaFa
 * @since 2022/5/26
 */
public class GetConstructor {

    @Test
    public void getConstructors(){

        Class studentClass = Student.class;
        Constructor[] constructors = studentClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName()+" | Params count: "+constructor.getParameterCount());
        }
    }

    @Test
    public void getDeclaredConstructors(){

        Class studentClass = Student.class;
        Constructor[] constructors = studentClass.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName()+" | Params count: "+constructor.getParameterCount());
        }
    }

    @Test
    public void getConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class studentClass = Student.class;
        Constructor constructor = studentClass.getConstructor();
        System.out.println(constructor.getName()+" | Params count: "+constructor.getParameterCount());
        Student student = (Student) constructor.newInstance();
        System.out.println(student);
    }

    @Test
    public void getParamsConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class studentClass = Student.class;
        Constructor constructor = studentClass.getConstructor(String.class,int.class);
        System.out.println(constructor.getName()+" | Params count: "+constructor.getParameterCount());
        Student student = (Student) constructor.newInstance("Jack",20);
        System.out.println(student);
    }

    @Test
    public void getDeclaredParamConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class studentClass = Student.class;
        Constructor constructor = studentClass.getDeclaredConstructor(String.class);
        System.out.println(constructor.getName()+" | Params count: "+constructor.getParameterCount());
        constructor.setAccessible(true);
        Student student = (Student) constructor.newInstance("jack");
    }




}
