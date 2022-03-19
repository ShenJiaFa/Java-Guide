package two_color_ball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Function: Simulated two-color ball lottery
 *
 * Author: ShenJiaFa
 * Since: 2022/3/13-13:15
 */
public class TwoColorBall {
    public static void main(String[] args) {
        List<Integer> userList = userInput();
        List<Integer> luckyList = generateLuckyNums();
        judge(userList, luckyList);
    }

    /**
     * Method of accepting user input
     *
     * @return User's two-color ball number
     */
    public static List<Integer> userInput() {
        Scanner scanner = new Scanner(System.in);
        //Create a list to hold the number purchased by the user
        List<Integer> userInput = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            System.out.println("Please input the " + (i + 1) + "'s" + (i == 6 ? " blue" : " red") + " number.");
            Integer num = scanner.nextInt();
            if (i == 6 ? (num >= 1 && num <= 16) : (!userInput.contains(num) && (num >= 1 && num <= 33))
            ) {
                userInput.add(num);
                System.out.println("success to put the " + (i + 1) + "'s number");
            } else {
                System.out.println("Wrong input, try again!");
                i--;
            }
        }
        return userInput;
    }

    /**
     * Generate 7-digit lucky number
     *
     * @return 7-digit lucky number list
     */
    public static List<Integer> generateLuckyNums() {
        Random rd = new Random();
        //Create a list of 7 lucky numbers
        List<Integer> luckyNums = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            luckyNums.add(rd.nextInt(33) + 1);
        }
        luckyNums.add(rd.nextInt(16) + 1);
        return luckyNums;
    }

    /**
     * Judge whether to win the prize
     *
     * @param userInput User's number
     * @param luckyNums Winning numbers
     * @return Winning situation
     */
    public static void judge(List<Integer> userInput, List<Integer> luckyNums) {
        //Create red and blue ball number identification
        int countRed = 0;
        int countBlue = 0;
        for (int i = 0; i < 6; i++) {
            if (luckyNums.contains(userInput.get(i))) {
                countRed++;
            }
        }
        if (luckyNums.get(6) == userInput.get(6)) {
            countBlue++;
        }
        //Match the awards according to the number of blue and red balls
        switch (countRed) {
            case 0:
            case 1:
            case 2:
                if (countBlue == 1) {
                    System.out.println("Congratulations!!!You won the sixth prize,the bonus is $5,Winning numbers:" + luckyNums);
                } else {
                    System.out.println("Sorry, you didn't win the prize. The winning number is:" + luckyNums);
                }
                break;
            case 3:
                if (countBlue == 1) {
                    System.out.println("Congratulations!!!You won the fifth prize,the bonus is $10,Winning numbers:" + luckyNums);
                } else {
                    System.out.println("Sorry, you didn't win the prize. The winning number is:" + luckyNums);
                }
                break;
            case 4:
                if (countBlue == 1) {
                    System.out.println("Congratulations!!!You won the fourth prize,the bonus is $200,Winning numbers:" + luckyNums);
                } else {
                    System.out.println("Sorry, you didn't win the prize. The winning number is:" + luckyNums);
                }
                break;
            case 5:
                if (countBlue == 1) {
                    System.out.println("Congratulations!!!You won the third prize,the bonus is $3000,Winning numbers:" + luckyNums);
                } else {
                    System.out.println("Congratulations!!!You won the fourth prize,the bonus is $200,Winning numbers:" + luckyNums);
                }
                break;
            case 6:
                if (countBlue == 1) {
                    System.out.println("Congratulations!!!You won the first prize,the bonus is $10000000,Winning numbers:" + luckyNums);
                } else {
                    System.out.println("Congratulations!!!You won the second prize,the bonus is $5000000,Winning numbers:" + luckyNums);
                }
                break;
        }
    }
}
