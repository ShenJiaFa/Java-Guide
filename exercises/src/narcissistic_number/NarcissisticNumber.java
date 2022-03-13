package narcissistic_number;

/**
 * function: Find narcissistic number
 * <p>
 * Author: shenjiafa
 * Since: 2022/3/13-11:18
 */
public class NarcissisticNumber {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int a = i / 100;
            int b = (i / 10) % 10;
            int c = i % 10;
            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.println(i);
            }
        }
    }
}
