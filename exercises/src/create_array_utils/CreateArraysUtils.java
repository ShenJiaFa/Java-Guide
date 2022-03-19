package create_array_utils;

/**
 * Function:
 *
 * Author: ShenJiaFa
 * Since: 2022/3/19-15:56
 */
public class CreateArraysUtils {
    public static void main(String[] args) {
        //Using the method of the utils class
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        float[] floats = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(ArraysUtils.toString(ints));
        System.out.println(ArraysUtils.getAverage(floats));
    }
}