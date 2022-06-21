package com.shenjiafa.theory.xml.convert;

/**
 * Function: Contact model class
 *
 * @author ShenJiaFa
 * @since 2022/6/20
 */
public class Contact {

    /**
     * Contact id
     */
    private int id;
    /**
     * Contact name
     */
    private String name;

    /**
     * Contact age
     */
    private int age;

    /**
     * Contact vip condition
     */
    private boolean vip;

    /**
     * Contact gender
     */
    private String gender;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Contact() {
    }

    public Contact(int id, String name, boolean vip, String gender) {
        this.id = id;
        this.name = name;
        this.vip = vip;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", vip=" + vip +
                ", gender=" + gender +
                '}';
    }

}
