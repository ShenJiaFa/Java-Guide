package com.shenjiafa.theory.design_patterns.factory.model;

import com.shenjiafa.theory.design_patterns.factory.base.Computer;

/**
 * Function: Mac model class
 *
 * @author ShenJiaFa
 * @since 2022/6/21
 */
public class Mac extends Computer {

    public Mac() {
    }

    public Mac(String name, double price) {
        super(name, price);
    }

    @Override
    public void start() {
        System.out.println(getName()+" Starts very gracefully!");
    }
}
