package com.shenjiafa.theory.thread.create;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/5/5
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("The child thread executes: " + i + " times");
        }
    }
}
