package com.shenjiafa.theory.reflect.constructor;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private Student(String name) {
        this.name = name;
    }

}
