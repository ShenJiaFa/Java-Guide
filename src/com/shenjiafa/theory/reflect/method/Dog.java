package com.shenjiafa.theory.reflect.method;

/**
 * Function: Dog class
 *
 * @author ShenJiaFa
 * @since 2022/5/28
 */
public class Dog {
    /**
     * The name of dog
     */
    private String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    /**
     * run method
     */
    public void run() {
        System.out.println("Dog run fast!");
    }

    /**
     * eat method
     */
    public void eat() {
        System.out.println("Dog eat bone!");
    }

    /**
     * eat method whit one param
     */
    public String eat(String name) {
        System.out.println("Dog eat " + name);
        return "Dog is very happy!";
    }

    public static void inAddress() {
        System.out.println("There are many dogs in my home!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
