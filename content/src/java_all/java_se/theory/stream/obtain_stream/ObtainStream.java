package java_all.java_se.theory.stream.obtain_stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * Function: Obtain stream
 *
 * @author: ShenJiaFa
 * @since: 2022/4/5
 */
public class ObtainStream {
    public static void main(String[] args) {

        // Collection obtain stream
        Collection<String> collectionList = new ArrayList<>();
        Stream<String> stream = collectionList.stream();

        // Map obtain stream
        Map<String, Integer> map = new HashMap<>();
        // Obtain key stream
        Stream<String> keysStream = map.keySet().stream();
        // Obtain value stream
        Stream<Integer> valuesStream = map.values().stream();
        // Obtain entry stream
        Stream<Map.Entry<String, Integer>> keysValuesStream = map.entrySet().stream();

        // Array obtain stream
        String[] names={"Tom","Jack","Jim","Lily"};
        // Method1:
        Stream<String> namesStreamA = Arrays.stream(names);
        Stream<String> namesStreamB = Stream.of(names);

    }
}
