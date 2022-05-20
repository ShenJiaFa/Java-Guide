package com.shenjiafa.theory.thread.pool;

import java.util.concurrent.*;

/**
 * Function: My callable class
 *
 * @author ShenJiaFa
 * @since 2022/5/20
 */
public class RunThreadPoolCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService pool = new ThreadPoolExecutor(3, 5, 8, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        Future<String> future1 = pool.submit(new MyCallable(100));
        Future<String> future2 =pool.submit(new MyCallable(200));
        Future<String> future3 =pool.submit(new MyCallable(300));
        Future<String> future4 =pool.submit(new MyCallable(400));
        Future<String> future5 =pool.submit(new MyCallable(500));

        System.out.println(future1.get());
        System.out.println(future2.get());
        System.out.println(future3.get());
        System.out.println(future4.get());
        System.out.println(future5.get());

    }
}
