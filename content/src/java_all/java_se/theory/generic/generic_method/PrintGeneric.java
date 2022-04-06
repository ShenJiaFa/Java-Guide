package java_all.java_se.theory.generic.generic_method;

/**
 * Function: Format output generic array
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class PrintGeneric {

    public static void main(String[] args) {

        // Prefabricate non-custom arrays
        Integer[] intArray = {1, 2, 3};
        Double[] doubleArray = {1.1, 2.2, 3.3};
        Boolean[] boolArray = {true, false, true};
        String[] strArray = {"Jim", "Tom", "Bill"};

        // Prefabricate custom array
        Apple[] appleArray = {new Apple("red apple"), new Apple("green apple"), new Apple("yellow apple")};


        // Print all arrays
        System.out.println("The result of Integer[] is:");
        printGeneric(intArray);
        System.out.println("The result of Double[] is:");
        printGeneric(doubleArray);
        System.out.println("The result of Boolean[] is:");
        printGeneric(boolArray);
        System.out.println("The result of String[] is:");
        printGeneric(strArray);
        System.out.println("The result of Apple[] is:");
        printGeneric(appleArray);

    }

    /**
     * Print generic array
     *
     * @param array Array
     * @param <T>   Generic Class
     */
    public static <T> void printGeneric(T[] array) {

        // guard statement
        if (null == array) {
            System.out.println("Arrays is null");
            return;
        }

        // Start build
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]).append(i == array.length - 1 ? "" : ",");
        }

        System.out.println(sb.append("]"));

    }
}
