package java.java_se.theory.collection.collections_util.collections_add_all;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Function: Add elements to list in batch
 *
 * @author: ShenJiaFa
 * @since: 2022/4/4
 */
public class CollectionsAddAll {
    public static void main(String[] args) {

        // Create a list
        List<String> fourKings=new ArrayList<String>();

        // Add first element
        fourKings.add("Andy");

        System.out.println(fourKings);

        // Batch increase
        Collections.addAll(fourKings,"Aaron","dawn","Jacky ");

        System.out.println(fourKings);

    }
}
