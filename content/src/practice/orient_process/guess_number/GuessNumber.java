package practice.orient_process.guess_number;

import java.util.Scanner;

/**
 * Function: Guess the value of the number
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class GuessNumber {
    public static void main(String[] args) {
        int lucyNum = 53;
        int input;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            input = scanner.nextInt();
            if (input < lucyNum) {
                System.out.println("Guess it's bigger.");
                continue;
            }
            if (input > lucyNum) {
                System.out.println("Guess it's smaller.");
                continue;
            }
            System.out.println("Bingo!");
            break;
        }
    }
}
