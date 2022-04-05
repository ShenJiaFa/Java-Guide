package theory.algorithm.selection_sort;

import java.util.Arrays;

/**
 * Function: Selection Sort
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class SelectionSort {
    public static void main(String[] args) {

        // Create an array
        Integer[] numbers = {33, 21, 32, 19, 61, 57, 43, 99, 71, 2, 86, 102};

        // Create swap container
        Integer t = null;

        // Start selection sort
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    t = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = t;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));

    }
}
