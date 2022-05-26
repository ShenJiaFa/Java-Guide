package com.shenjiafa.theory.reflect;

/**
 * Function: Run reflect
 *
 * @author ShenJiaFa
 * @since 2022/5/26
 */
public class RunReflect {
    public static void main(String[] args) throws ClassNotFoundException {

        Class studentClass = Class.forName("com.shenjiafa.theory.reflect.Student");
        System.out.println(studentClass);

        System.out.println(Student.class);

        Student student = new Student();
        System.out.println(student.getClass());

    }
}
