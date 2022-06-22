package com.shenjiafa.theory.design_patterns.decorator;

/**
 * Function: Simulate InputStream
 *
 * @author ShenJiaFa
 * @since 2022/6/22
 */
public abstract class InputStream {

    public abstract int read();

    public abstract int read(byte[] buffer);

}
