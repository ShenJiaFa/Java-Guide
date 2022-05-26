package com.shenjiafa.theory.reflect;

/**
 * Function: Student class
 *
 * @author ShenJiaFa
 * @since 2022/5/26
 */
public class Student {
    /**
     * Student name
     */
    private String name;

    /**
     * Student age
     */
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Student(String name) {
        this.name = name;
    }

}
