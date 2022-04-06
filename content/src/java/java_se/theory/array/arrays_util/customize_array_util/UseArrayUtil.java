package java.java_se.theory.array.arrays_util.customize_array_util;

/**
 * Function:
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class UseArrayUtil {
    public static void main(String[] args) {

        // Use the method of the utils class
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        float[] floats = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(ArraysUtil.toString(ints));
        System.out.println(ArraysUtil.getAverage(floats));
    }
}