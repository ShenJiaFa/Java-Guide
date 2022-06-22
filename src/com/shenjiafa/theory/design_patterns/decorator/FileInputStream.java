package com.shenjiafa.theory.design_patterns.decorator;

/**
 * Function: Simulate FileInputStream
 *
 * @author ShenJiaFa
 * @since 2022/6/22
 */
public class FileInputStream extends InputStream{
    @Override
    public int read() {
        return 0;
    }

    @Override
    public int read(byte[] buffer) {
        return 0;
    }
}
