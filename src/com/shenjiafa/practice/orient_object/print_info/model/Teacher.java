package com.shenjiafa.practice.orient_object.print_info.model;

/**
 * Function: Teacher model class
 *
 * @author ShenJiaFa
 * @since 2022/5/29
 */
public class Teacher {

    /**
     * Teacher name
     */
    private String name;

    /**
     * Teacher gender
     */
    private char gender;

    /**
     * Teacher salary
     */
    private double salary;

    public Teacher() {
    }

    public Teacher(String name, char gender, double salary) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }

}
