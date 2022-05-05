package com.shenjiafa.theory.thread;

/**
 * Function: Create thread by extends Thread
 *
 * @author ShenJiaFa
 * @since 2022/5/5
 */
public class CreateThread1 {
    public static void main(String[] args) {

        Thread thread =new MyThread();
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("The main thread executes: " + i + " times");
        }
    }
}
