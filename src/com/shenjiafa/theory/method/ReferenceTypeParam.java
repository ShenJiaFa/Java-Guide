package com.shenjiafa.theory.method;

/**
 * Function: Call reference type param method
 *
 * @author ShenJiaFa
 * @since 2022/6/26
 */
public class ReferenceTypeParam {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println("调用change方法前：" + arr[1]);
        change(arr);
        System.out.println("调用change方法后：" + arr[1]);
    }

    /**
     * Change number array
     *
     * @param arr target number array
     */
    public static void change(int[] arr) {
        arr[1] = 200;
    }
}
