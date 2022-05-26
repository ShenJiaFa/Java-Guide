package com.shenjiafa.theory.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/5/26
 */
public class TestGetConstructor {

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
    public void getConstructor() throws NoSuchMethodException {

        Class studentClass = Student.class;
        Constructor constructor = studentClass.getConstructor();
        System.out.println(constructor.getName()+" | Params count: "+constructor.getParameterCount());
    }

}
