package create_array_utils;

/**
 * Function: Utils class of array
 *
 * Author: ShenJiaFa
 * Since: 2022/3/19-15:15
 */
public final class ArraysUtils {

    /**
     * Constructor privatization
     */
    private ArraysUtils() {

    }

    /**
     * Return the specified format
     *
     * @param array Integer array
     * @return Specified format of array
     */
    public static String toString(int[] array) {
        if (null == array) {
            return null;
        }
        String out = "[";
        for (int i = 0; i < array.length; i++) {
            out += i == array.length - 1 ? i : i + ",";
        }
        out += "]";
        return out;
    }

    /**
     * Returns the average number of array
     *
     * @param array Float array
     * @return average number of array
     */
    public static Double getAverage(float[] array) {
        float maxScore = array[0];
        float minScore = array[0];
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            //Find the minimum value again
            if (array[i] < minScore) {
                minScore = array[i];
            }
            //Find the maximum value first
            if (array[i] > maxScore) {
                maxScore = array[i];
            }
            sum += array[i];
        }
        return (sum - maxScore - minScore) / (array.length - 2.0);
    }
}