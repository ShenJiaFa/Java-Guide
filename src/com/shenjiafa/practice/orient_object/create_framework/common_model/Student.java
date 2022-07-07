package com.shenjiafa.practice.orient_object.create_framework.common_model;

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

    /**
     * School name
     */
    private String schoolName;

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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    /**
     * Self-introduction method
     *
     * @param name       Student name
     * @param age        Student age
     * @param schoolName Student school name
     */
    public void studentSelfIntroduction(String name, int age, String schoolName) {
        System.out.println("My name is " + name + ",I am " + age + " years old and my school is " + schoolName+",I am a student.");
    }

    public Student() {
    }

    public Student(String name, int age, String schoolName) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

}
