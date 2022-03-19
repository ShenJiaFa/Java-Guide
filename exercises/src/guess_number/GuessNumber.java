package guess_number;

import java.util.Scanner;

/**
 * Function: Guess the value of the number
 *
 * Author: ShenJiaFa
 * Since: 2022/3/13-12:16
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
