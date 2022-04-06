package java.java_se.theory.collection.collections_util.collections_sort_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Function: List Sort
 *
 * @author: ShenJiaFa
 * @since: 2022/4/4
 */
public class CollectionsSortList {
    public static void main(String[] args) {
        // Create a list
        List<Apple> apples = new ArrayList<>();

        //Method 1: Inherit the interface
        System.out.println("Method 1: Inherit the interface:");
        // Add elements in batch
        Collections.addAll(apples, new Apple("Red Apple", "red", 12.5, 2), new Apple("Yellow Apple", "Yellow", 13.5, 0), new Apple("Green Apple", "green", 10.5, 1));
        // Start sort
        Collections.sort(apples);

        System.out.println(apples);

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Method 2: Using a Comparator");
        // Method 2: Using a Comparator
        Collections.sort(apples, (o1, o2) -> o2.getDefectCount() - o1.getDefectCount());

        System.out.println(apples);

    }
}
