package com.shenjiafa.practice.orient_process.peach_number;

/**
 * Function: Calculate the total number of peaches
 *
 * @author ShenJiaFa
 * @since 2022/4/22
 */
public class PeachNumber {
    public static void main(String[] args) {

        System.out.println(f(1));

    }

    /**
     * Count the number of peaches on the nth day
     *
     * @param n Specify the day
     * @return The number of peaches on the day
     */
    public static int f(int n) {
        if (n == 10) {
            return 1;
        }
        return (f(n + 1) + 1) * 2;
    }
}
