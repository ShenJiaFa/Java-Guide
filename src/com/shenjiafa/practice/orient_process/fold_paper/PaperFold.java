package com.shenjiafa.practice.orient_process.fold_paper;

/**
 * Function: Calculate the fold times
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class PaperFold {
    public static void main(String[] args) {
        double height = 0.1;
        int count = 0;
        while (height < 8848860) {
            count++;
            height *= 2;
        }
        System.out.println(count);
    }
}
