package com.shenjiafa.theory.design_patterns.factory.model;

import com.shenjiafa.theory.design_patterns.factory.base.Computer;

/**
 * Function: PC model class
 *
 * @author ShenJiaFa
 * @since 2022/6/21
 */
public class PC extends Computer {

    public PC() {
    }

    public PC(String name, double price) {
        super(name, price);
    }

    @Override
    public void start() {
        System.out.println(getName()+" Starts very fast!");
    }
}
