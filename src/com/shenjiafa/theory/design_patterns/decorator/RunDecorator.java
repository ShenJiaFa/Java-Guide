package com.shenjiafa.theory.design_patterns.decorator;

/**
 * Function: Run decorator pattern
 *
 * @author ShenJiaFa
 * @since 2022/6/24
 */
public class RunDecorator {
    public static void main(String[] args) {
        InputStream bufferedInputStream = new BufferedInputStream(new FileInputStream());
        System.out.println(bufferedInputStream.read());
        System.out.println(bufferedInputStream.read(new byte[3]));
    }
}
