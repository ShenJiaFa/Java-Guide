package com.shenjiafa.theory.thread.pool;

import java.util.concurrent.*;

/**
 * Function: My runnable class
 *
 * @author ShenJiaFa
 * @since 2022/5/12
 */
public class RunThreadPool {
    public static void main(String[] args) {

        ExecutorService executor = new ThreadPoolExecutor(3, 5, 6, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        Runnable target = new MyRunnable();
        executor.execute(target);
        executor.execute(target);
        executor.execute(target);
        executor.execute(target);
        executor.execute(target);
        executor.execute(target);
        executor.execute(target);
        executor.execute(target);
        executor.execute(target);
        executor.execute(target);

    }
}
