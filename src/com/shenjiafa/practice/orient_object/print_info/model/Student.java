package com.shenjiafa.practice.orient_object.print_info.model;

/**
 * Function: Student model class
 *
 * @author ShenJiaFa
 * @since 2022/5/29
 */
public class Student {

    /**
     * Student name
     */
    private String name;

    /**
     * Student gender
     */
    private char gender;

    /**
     * Student age
     */
    private int age;

    /**
     * Student class name
     */
    private String className;

    /**
     * Student hobby
     */
    private String hobby;

    public Student() {
    }

    public Student(String name, char gender, int age, String className, String hobby) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.className = className;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", className='" + className + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }

}
