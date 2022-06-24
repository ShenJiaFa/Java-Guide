package com.shenjiafa.theory.design_patterns.decorator;

import java.util.Arrays;

/**
 * Function: Simulate FileInputStream
 *
 * @author ShenJiaFa
 * @since 2022/6/22
 */
public class FileInputStream extends InputStream {
    @Override
    public int read() {
        System.out.println("Low performance way to read a byte A.");
        return 97;
    }

    @Override
    public int read(byte[] buffer) {
        buffer[0] = 97;
        buffer[1] = 98;
        buffer[2] = 99;
        System.out.println("Low performance way to read a byte array " + Arrays.toString(buffer));
        return 3;
    }
}
