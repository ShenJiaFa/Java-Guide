package com.shenjiafa.theory.thread.security;

/**
 * Function: Run withdraw
 *
 * @author ShenJiaFa
 * @since 2022/5/6
 */
public class RunApp {
    public static void main(String[] args) {

        Account acc=new Account("ACC-123",10000);

        new DrawThread(acc,"Jack").start();
        new DrawThread(acc,"Bill").start();

    }
}
