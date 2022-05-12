package com.shenjiafa.theory.thread.communication;

/**
 * Function: Run thread communication
 *
 * @author ShenJiaFa
 * @since 2022/5/11
 */
public class RunAppThreadCommunication {
    public static void main(String[] args) {

        Account acc = new Account("ACC-123", 0);

        new DrawThread(acc, "Jack").start();
        new DrawThread(acc, "Bill").start();

        new DepositThread(acc, "Dad1").start();
        new DepositThread(acc, "Dad2").start();
        new DepositThread(acc, "Dad3").start();

    }
}
