package com.shenjiafa.theory.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Function: Create timer
 *
 * @author ShenJiaFa
 * @since 2022/5/21
 */
public class CreateTimer {
    public static void main(String[] args) {

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread() + "Print A !" + new Date());
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, 0, 2000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread() + "Print B !" + new Date());
                System.out.println(10/0);
            }
        }, 0, 2000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread() + "Print C !" + new Date());
            }
        }, 0, 2000);

    }
}
