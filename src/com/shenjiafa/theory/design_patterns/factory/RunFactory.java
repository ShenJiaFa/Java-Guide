package com.shenjiafa.theory.design_patterns.factory;

import com.shenjiafa.theory.design_patterns.factory.base.Computer;

/**
 * Function: Run factory
 *
 * @author ShenJiaFa
 * @since 2022/6/21
 */
public class RunFactory {
    public static void main(String[] args) {
        Computer c=ComputerFactory.getComputer("Mac");
        c.start();

    }
}
