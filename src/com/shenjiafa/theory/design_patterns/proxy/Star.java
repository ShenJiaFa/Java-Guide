package com.shenjiafa.theory.design_patterns.proxy;

/**
 * Function: Star model class
 *
 * @author ShenJiaFa
 * @since 2022/6/2
 */
public class Star implements Skill {

    /**
     * The name of star
     */
    private String name;

    public Star(String name) {
        this.name = name;
    }

    @Override
    public void sing() {
        System.out.println(name + " is singing!");
    }

    @Override
    public void dance() {
        System.out.println(name + " is dancing!");
    }

    @Override
    public void speak() {
        System.out.println(name + " is speaking!");
    }
}
