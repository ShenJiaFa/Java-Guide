package com.shenjiafa.theory.stream.operate_stream;

/**
 * Function: Student model
 *
 * @author: ShenJiaFa
 * @since: 2022/4/6
 */
public class Student {
    /**
     * Student name
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

}
