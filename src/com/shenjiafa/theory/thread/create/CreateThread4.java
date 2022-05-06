package com.shenjiafa.theory.thread.create;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Function: Create thread by callable
 *
 * @author ShenJiaFa
 * @since 2022/5/6
 */
public class CreateThread4 {
    public static void main(String[] args) {

        FutureTask<String> task1 = new FutureTask<>(new MyCallable(100));
        Thread thread1 = new Thread(task1);
        thread1.start();

        FutureTask<String> task2 = new FutureTask<>(new MyCallable(200));
        Thread thread2 = new Thread(task2);
        thread2.start();

        try {
            System.out.println(task1.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(task2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
