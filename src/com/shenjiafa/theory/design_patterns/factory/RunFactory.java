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

        Computer imac=ComputerFactory.getComputer("Mac");
        Computer surface=ComputerFactory.getComputer("PC");

        imac.start();
        surface.start();
    }
}
