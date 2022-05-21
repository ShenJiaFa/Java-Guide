package com.shenjiafa.theory.thread.pool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Function: Use executor to create a thread pool
 *
 * @author ShenJiaFa
 * @since 2022/5/21
 */
public class UseExecutors {
    public static void main(String[] args) {

        ExecutorService pool=Executors.newFixedThreadPool(3);
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());

    }
}
