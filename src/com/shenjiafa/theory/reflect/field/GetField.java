package com.shenjiafa.theory.reflect.field;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Function: Get field
 *
 * @author ShenJiaFa
 * @since 2022/5/27
 */
public class GetField {

    /**
     * Get all public fields
     */
    @Test
    public void getFields() {

        Class studentClass = Student.class;
        Field[] fields = studentClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " : " + field.getType());
        }
    }

    /**
     * Get all fields whether public or private
     */
    @Test
    public void getDeclaredFields() {

        Class studentClass = Student.class;
        Field[] fields = studentClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " : " + field.getType());
        }
    }

    @Test
    public void getDeclaredField() throws NoSuchFieldException, IllegalAccessException {

        Class studentClass = Student.class;
        Field ageField = studentClass.getDeclaredField("age");
        System.out.println(ageField.getName() + "==>" + ageField.getType());

        Student student = new Student();
        ageField.setAccessible(true);
        ageField.set(student, 18);

        System.out.println(student);

        int age = (int) ageField.get(student);
        System.out.println(age);


    }


}
