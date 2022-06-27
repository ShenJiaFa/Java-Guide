package com.shenjiafa.theory.reflect.clazz;

/**
 * Function: Person model class
 *
 * @author ShenJiaFa
 * @since 2022/6/27
 */
public class Person {

    /**
     * Person name
     */
    private String name;

    /**
     * Person age
     */
    private int age;

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

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
