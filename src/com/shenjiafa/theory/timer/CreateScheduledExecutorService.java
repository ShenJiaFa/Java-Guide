package com.shenjiafa.theory.timer;

import java.util.Date;
import java.util.concurrent.*;

/**
 * Function: Create ScheduledExecutorService
 *
 * @author ShenJiaFa
 * @since 2022/5/21
 */
public class CreateScheduledExecutorService {
    public static void main(String[] args) {

        ScheduledExecutorService pool= Executors.newScheduledThreadPool(3);

        pool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread()+"Print A !"+new Date());
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },0,2000, TimeUnit.MILLISECONDS);

        pool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread()+"Print B !"+new Date());
                System.out.println(10/0);
            }
        },0,2000, TimeUnit.MILLISECONDS);

        pool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread()+"Print C !"+new Date());
            }
        },0,2000, TimeUnit.MILLISECONDS);

    }
}
