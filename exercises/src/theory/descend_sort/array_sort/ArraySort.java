package theory.descend_sort.array_sort;

import java.util.Arrays;

/**
 * Function: Array descend sort
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class ArraySort {
    public static void main(String[] args) {

        // Create an array
        Integer[] numbers = {33, 21, 32, 19, 61, 57, 43, 99, 71, 2, 86, 102};

        //Sort with Comparator
        Arrays.sort(numbers, (o1, o2) -> o2 - o1);

        System.out.println(Arrays.toString(numbers));

    }
}
