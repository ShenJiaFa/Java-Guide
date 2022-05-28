package com.shenjiafa.theory.reflect.constructor;

/**
 * Function: Run reflect
 *
 * @author ShenJiaFa
 * @since 2022/5/26
 */
public class GetClass {
    public static void main(String[] args) throws ClassNotFoundException {

        // The first method to get class
        Class studentClass = Class.forName("com.shenjiafa.theory.reflect.constructor.Student");
        System.out.println(studentClass);

        // The second method to get class
        System.out.println(Student.class);

        // The third method to get class
        Student student = new Student();
        System.out.println(student.getClass());

    }
}
