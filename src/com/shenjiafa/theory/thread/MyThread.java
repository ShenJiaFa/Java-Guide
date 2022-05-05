package com.shenjiafa.theory.thread;

/**
 * Function: My thread class
 *
 * @author ShenJiaFa
 * @since 2022/5/5
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("The child thread executes: " + i + " times");
        }
    }
}
