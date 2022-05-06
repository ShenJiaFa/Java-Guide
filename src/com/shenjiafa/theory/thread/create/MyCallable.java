package com.shenjiafa.theory.thread.create;

import java.util.concurrent.Callable;

/**
 * Function: My callable class
 *
 * @author ShenJiaFa
 * @since 2022/5/6
 */
public class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return "The execution result of the child thread is : "+sum;
    }
}
