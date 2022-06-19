package com.shenjiafa.theory.annotation.simulate_junit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Function: Simulate Junit
 *
 * @author ShenJiaFa
 * @since 2022/6/2
 */
public class SimulateJunit {
    @MyTest
    public void test1() {
        System.out.println("=========Test1=========");
    }

    public void test2() {
        System.out.println("=========Test2=========");
    }

    @MyTest
    public void test3() {
        System.out.println("=========Test3=========");
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class simulateJunitClass = SimulateJunit.class;
        Method[] methods = simulateJunitClass.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)) {
                method.invoke(new SimulateJunit());
            }
        }
    }
}
