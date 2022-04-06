package java_knowledge.java_se.theory.array.array_application.array_format_output;

import java.util.Objects;

/**
 * Function: Format output array
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class ArrayFormatOutput {

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

        // Guard statement
        if (Objects.equals(array, null)) {
            return null;
        }

        // Start build
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]).append(i == array.length - 1 ? "" : ",");
        }
        sb.append("]");

        return sb.toString();

    }
}
