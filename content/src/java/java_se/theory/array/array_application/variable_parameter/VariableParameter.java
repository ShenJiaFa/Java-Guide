package java.java_se.theory.array.array_application.variable_parameter;

/**
 * Function: Variadic array summation
 *
 * @author: ShenJiaFa
 * @since: 2022/4/4
 */
public class VariableParameter {
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

    /**
     * Sum of variadic arguments
     * @param nums Parameter list
     * @return Sum
     */
    private static int sum(int... nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

}
