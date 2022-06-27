package com.shenjiafa.theory.reflect.clazz;

/**
 * Function: Three ways to get clazz
 *
 * @author ShenJiaFa
 * @since 2022/6/27
 */
public class GetClazz {
    public static void main(String[] args) throws ClassNotFoundException {
        // The first method: Class.forName();
        Class personClazz1 = Class.forName("com.shenjiafa.theory.reflect.clazz.Person");

        // The second method: Xxx.class;
        Class personClazz2 = Person.class;

        // The third method: xxx.getClass;
        Class personClazz3 = new Person().getClass();

        System.out.println(personClazz1==personClazz2);
        System.out.println(personClazz1==personClazz3);

    }
}
