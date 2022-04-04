package theory.collections_util_operation.add_elements_to_list_in_batch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Function: Add elements to list in batch
 *
 * @author: ShenJiaFa
 * @since: 2022/4/4
 */
public class AddElementsToListInBatch {
    public static void main(String[] args) {

        // Create a list
        List<String> fourKings=new ArrayList<String>();

        // Add first element
        fourKings.add("Andy");

        // Print result
        System.out.println(fourKings);

        // Batch increase
        Collections.addAll(fourKings,"Aaron","dawn","Jacky ");

        // Print result
        System.out.println(fourKings);

    }
}
