package descend_sort.array_sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Function: Array descend sort
 *
 * Author: ShenJiaFa
 * Since: 2022/3/31-19:03
 */
public class ArraySort {
    public static void main(String[] args) {

        // Create an array
        Integer[] numbers={33,21,32,19,61,57,43,99,71,2,86,102};

        //Sort with Comparator
        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        System.out.println(Arrays.toString(numbers));

    }
}
