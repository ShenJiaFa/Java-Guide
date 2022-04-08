package java_all.java_se.theory.exception.show_runtime_exception;

/**
 * Function:
 *
 * @author: ShenJiaFa
 * @since: 2022/4/7
 */
public class ShowRuntimeException {
    public static void main(String[] args) {

        // ArrayIndexOutOfBoundsException
        int[] nums = {1, 2, 3};
        System.out.println(nums[3]);

        // NullPointerException
        String name = null;
        System.out.println(name.length());

        // ClassCastException
        Object o = 10;
        String s = (String) o;

        // ArithmeticException
        int num = 10 / 0;

        // NumberFormatException
        String numberStr = "10a";
        int number = Integer.parseInt(numberStr);
        System.out.println(number);

    }
}
