package theory.create_array_utils;

/**
 * Function:
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class CreateArraysUtils {
    public static void main(String[] args) {

        // Use the method of the utils class
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        float[] floats = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Print result
        System.out.println(ArraysUtils.toString(ints));
        System.out.println(ArraysUtils.getAverage(floats));
    }
}