package com.shenjiafa.practice.orient_process.beer_problem;

/**
 * Function: Solve the classic buying beer problem
 *
 * @author ShenJiaFa
 * @since 2022/4/23
 */
public class Beer {

    private static int total;

    private static int bottlesRemain;

    private static int capRemain;

    public static void main(String[] args) {
        buy(10);
        System.out.println(total);
        System.out.println(bottlesRemain);
        System.out.println(capRemain);
    }

    public static void buy(int money) {

        int buyNum = money / 2;
        total += buyNum;

        int bottles = bottlesRemain + buyNum;
        int caps = capRemain + buyNum;

        int allMoney = 0;
        if (bottles >= 2) {
            allMoney += (bottles / 2) * 2;
        }
        bottlesRemain = bottles % 2;

        if (caps >= 4) {
            allMoney += (caps / 4) * 2;
        }
        capRemain = caps % 4;

        if (allMoney >= 2) {
            buy(allMoney);
        }
    }
}
