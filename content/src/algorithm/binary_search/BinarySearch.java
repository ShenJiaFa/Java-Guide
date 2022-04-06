package algorithm.binary_search;

/**
 * Function: Binary search
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class BinarySearch {
    public static void main(String[] args) {

        // Create Array
        Integer[] numbers = {2, 19, 21, 32, 33, 43, 57, 61, 71, 86, 99, 102};

        // Start binary search
        Integer index = binarySearch(numbers, 57);
        System.out.println(index);

    }

    /**
     * Binary search
     *
     * @param numbers Integer Array
     * @param number  Target number
     * @return The index of target number
     */
    private static Integer binarySearch(Integer[] numbers, Integer number) {

        // Create left, right flag
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            // Create middle flag
            int mid = (left + right) / 2;

            //Start judge
            if (number > numbers[mid]) {
                left = mid + 1;
            } else if (number < numbers[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
