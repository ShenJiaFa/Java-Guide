package format_output;

import java.util.Objects;

/**
 * Function: Format output array
 *
 * Author: ShenJiaFa
 * Since: 2022/3/26-16:38
 */
public class FormatOutput {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        System.out.println(toString(array));
    }

    /**
     * Format array method
     *
     * @param array Array
     * @return Format output
     */
    public static String toString(int[] array) {

        if (Objects.equals(array, null)) {
            return null;
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]).append(i == array.length - 1 ? "" : ",");
        }
        sb.append("]");

        return sb.toString();
    }
}
