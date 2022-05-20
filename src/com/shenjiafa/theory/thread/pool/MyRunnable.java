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
            System.out.println(Thread.currentThread().getName()+" run "+(i+1)+" time");
            try {
                Thread.sleep(1000000);
                System.out.println("This task is bound by this thread");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
