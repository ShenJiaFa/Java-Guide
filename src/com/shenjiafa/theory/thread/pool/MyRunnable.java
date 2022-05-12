package com.shenjiafa.theory.thread.pool;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/5/12
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" run "+i+1+" time");
        }
    }
}
