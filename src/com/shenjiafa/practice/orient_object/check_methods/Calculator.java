package com.shenjiafa.practice.orient_object.check_methods;

/**
 * Function: Simulate calculator
 *
 * @author ShenJiaFa
 * @since 2022/7/7
 */
@SuppressWarnings("all")
public class Calculator {

    /**
     * Addition
     */
    @Check
    public void add() {
        System.out.println("1+0=" + (1 + 0));
    }

    /**
     * Subtraction
     */
    @Check
    public void sub() {
        System.out.println("1-0=" + (1 - 0));
    }

    /**
     * Multiplication
     */
    @Check
    public void mul() {
        System.out.println("1*0=" + (1 * 0));
    }

    /**
     * Division
     */
    @Check
    public void div() {
        System.out.println("1*0=" + (1 / 0));
    }

    /**
     * Self-introduce
     */
    public void introduce() {
        System.out.println("I am a calculator");
    }

}
