package practice.simple.judge_prime_number;

/**
 * Function: Judge whether a number is prime
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
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
