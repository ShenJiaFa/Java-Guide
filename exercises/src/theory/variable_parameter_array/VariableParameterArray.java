package theory.variable_parameter_array;

/**
 * Function: Variadic array summation
 *
 * @author: ShenJiaFa
 * @since: 2022/4/4
 */
public class VariableParameterArray {
    public static void main(String[] args) {
        // Create some arrays with different parameter lists
        int[] array = {1, 2, 3};

        //print the sum of array
        System.out.println(sum());
        System.out.println(sum(1));
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(array));

    }

    private static int sum(int... nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

}
