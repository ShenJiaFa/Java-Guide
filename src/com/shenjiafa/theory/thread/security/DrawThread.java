package com.shenjiafa.theory.thread.security;

/**
 * Function: DrawThread class
 *
 * @author ShenJiaFa
 * @since 2022/5/10
 */
public class DrawThread extends Thread{

    private Account acc;

    public DrawThread(Account acc,String name){
        super(name);
        this.acc=acc;
    }

    public DrawThread() {
    }

    @Override
    public void run() {
        acc.withDraw(10000);
    }
}
