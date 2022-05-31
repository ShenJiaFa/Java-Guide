package com.shenjiafa.theory.reflect.application;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Function: Add data for collection
 *
 * @author ShenJiaFa
 * @since 2022/5/29
 */
public class AddDataForCollection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        ArrayList<String> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        System.out.println(list1.getClass());
        System.out.println(list2.getClass());
        System.out.println(list1.getClass()==list2.getClass());

        System.out.println("------------");

        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(1);
        list3.add(2);

        Class arrayListClass = list3.getClass();
        Method addMethod = arrayListClass.getDeclaredMethod("add", Object.class);
        System.out.println(addMethod.invoke(list3, "Three"));
        System.out.println(list3);

        ArrayList list4 = list3;
        list4.add("Four");
        System.out.println(list3);

    }
}
