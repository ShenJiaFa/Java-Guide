package com.shenjiafa.theory.thread.api;

/**
 * Function: My thread class
 *
 * @author ShenJiaFa
 * @since 2022/5/6
 */
public class MyThread extends Thread {

    private String name;

    public MyThread(String name) {
        super(name);
    }

    public MyThread() {
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " running " + i + " times!");
        }
    }

}
