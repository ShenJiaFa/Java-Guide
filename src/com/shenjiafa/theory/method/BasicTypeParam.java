package com.shenjiafa.theory.method;

/**
 * Function: Call basic type param method
 *
 * @author ShenJiaFa
 * @since 2022/6/26
 */
public class BasicTypeParam {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前：" + number);
        change(number);
        System.out.println("调用change方法后：" + number);
    }

    /**
     * Change number
     *
     * @param number target number
     */
    public static void change(int number) {
        number = 200;
    }
}
