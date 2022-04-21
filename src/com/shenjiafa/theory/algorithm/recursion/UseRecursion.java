package com.shenjiafa.theory.algorithm.recursion;

/**
 * Function: Use Recursion
 *
 * @author ShenJiaFa
 * @since 2022/4/21
 */
public class UseRecursion {
    public static void main(String[] args) {

        System.out.println(f(5));

    }

    /**
     * Calculate the factorial of n
     *
     * @param n Number
     * @return factorial
     */
    public static int f(int n) {
        if (n == 1) {
            return 1;
        }
        return n * f(n - 1);
    }
}
