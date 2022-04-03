package iterate_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Function: Iterate collection with iterator
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class IterateByIterator {
    public static void main(String[] args) {

        // Create a collection and prefab data
        Collection<String> collectionList = new ArrayList<>();
        collectionList.add("郭富城");
        collectionList.add("刘德华");
        collectionList.add("黎明");
        collectionList.add("张学友");
        collectionList.add("梁朝伟");
        collectionList.add("周星驰");

        // Get iterator
        Iterator<String> iterator = collectionList.iterator();

        // Start iterate
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
