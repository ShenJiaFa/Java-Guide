package judge_prime_number;

/**
 * Function: Judge whether a number is prime
 *
 * Author: ShenJiaFa
 * Since: 2022/3/13-12:53
 */
public class JudgePrimeNumber {
    public static void main(String[] args) {
        for (int i = 101; i <= 200; i++) {
            boolean flag = true;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag == true) {
                System.out.print(i + "\t");
            }
        }
    }
}
