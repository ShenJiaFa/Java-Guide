package com.shenjiafa.theory.thread.create;

/**
 * Function: Create thread by implements runnable
 *
 * @author ShenJiaFa
 * @since 2022/5/5
 */
public class CreateThread2 {
    public static void main(String[] args) {

        Runnable target = new MyRunnable();
        Thread thread = new Thread(target);
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("The main thread executes: " + i + " times");
        }
    }
}
