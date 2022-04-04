package theory.iterate_collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Function: Iterate collection
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class IterateByLambda {
    public static void main(String[] args) {

        // Create a collection and prefab data
        Collection<String> collectionList = new ArrayList<>();
        collectionList.add("曹操");
        collectionList.add("刘备");
        collectionList.add("张飞");
        collectionList.add("关羽");
        collectionList.add("荀彧");
        collectionList.add("孙权");
        collectionList.add("诸葛亮");
        collectionList.add("太史慈");

        // Iterate collection by lambda
        collectionList.forEach(System.out::println);

    }
}
