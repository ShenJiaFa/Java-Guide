package find_number;

import java.util.Arrays;

/**
 * Function: Find number
 *
 * Author: ShenJiaFa
 * Since: 2022/3/31-12:25
 */
public class FindNumber {
    public static void main(String[] args) {

        // Create an array
        Integer[] numbers={21,32,19,61,57,43,99,71,2,86};

        // Sort first
        Arrays.sort(numbers);

        //Start binary Search
        int index = Arrays.binarySearch(numbers, 86);

        System.out.println("The index of nine is: "+index);

    }
}
