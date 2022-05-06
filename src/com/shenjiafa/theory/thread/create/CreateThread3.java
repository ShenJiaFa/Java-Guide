package com.shenjiafa.theory.thread.create;

/**
 * Function: Create thread by create anonymous inner class
 *
 * @author ShenJiaFa
 * @since 2022/5/5
 */
public class CreateThread3 {
    public static void main(String[] args) {

        Runnable target = new MyRunnable(){
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("The child thread executes: " + i + " times");
                }
            }
        };
        Thread thread = new Thread(target);
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("The main thread executes: " + i + " times");
        }
    }
}
