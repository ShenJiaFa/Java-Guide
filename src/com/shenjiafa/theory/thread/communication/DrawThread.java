package com.shenjiafa.theory.thread.communication;


/**
 * Function: DrawThread class
 *
 * @author ShenJiaFa
 * @since 2022/5/10
 */
public class DrawThread extends Thread {

    private Account acc;

    public DrawThread(Account acc, String name) {
        super(name);
        this.acc = acc;
    }

    public DrawThread() {
    }

    @Override
    public void run() {
        while (true) {
            acc.withDraw(10000);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
