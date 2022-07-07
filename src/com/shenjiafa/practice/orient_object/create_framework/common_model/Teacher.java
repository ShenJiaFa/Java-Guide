package com.shenjiafa.practice.orient_object.create_framework.common_model;

/**
 * Function: Teacher model
 *
 * @author ShenJiaFa
 * @since 2022/7/5
 */
public class Teacher {
    /**
     * Teacher name
     */
    private String name;

    /**
     * Teacher age
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
     * @param name       Teacher name
     * @param age        Teacher age
     * @param schoolName Teacher school name
     */
    public void teacherSelfIntroduction(String name, int age, String schoolName) {
        System.out.println("My name is " + name + ",I am " + age + " years old and my school is " + schoolName+",I am a teacher.");
    }

    public Teacher() {
    }

    public Teacher(String name, int age, String schoolName) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
