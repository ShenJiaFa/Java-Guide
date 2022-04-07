package java_all.java_se.practice.orient_object.input_price;

import java.util.Scanner;

/**
 * Function: Enter valid price
 *
 * @author: ShenJiaFa
 * @since: 2022/4/7
 */
public class InputPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Please input valid price:");
                String price = scanner.nextLine();
                double priceValue = Double.valueOf(price);
                if (priceValue > 0) {
                    System.out.println("Input success!");
                } else {
                    System.out.println("Input fail!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input invalid!");
            }
        }
    }
}
