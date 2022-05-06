package com.shenjiafa.theory.thread.api;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/5/6
 */
public class UseThreadName {
    public static void main(String[] args) {

        Thread thread1 = new MyThread("Thread 1st");
        thread1.start();

        Thread thread2 = new MyThread("Thread 2st");
        thread2.start();

        Thread main = Thread.currentThread();
        main.setName("Main Thread");

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " running " + i + " times!");
        }

    }
}
