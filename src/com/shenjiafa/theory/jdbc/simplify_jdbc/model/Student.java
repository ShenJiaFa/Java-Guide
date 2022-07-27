package com.shenjiafa.theory.jdbc.simplify_jdbc.model;

import java.util.Date;

/**
 * Function: Student model class
 *
 * @author ShenJiaFa
 * @since 2022/7/26
 */
public class Student {
    /**
     * Student id
     */
    private Long id;

    /**
     * Student name
     */
    private String name;

    /**
     * Student age
     */
    private Integer age;

    /**
     * Student height
     */
    private Double height;

    /**
     * Student admission date
     */
    private Date admissionDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", admissionDate=" + admissionDate +
                '}';
    }
}
