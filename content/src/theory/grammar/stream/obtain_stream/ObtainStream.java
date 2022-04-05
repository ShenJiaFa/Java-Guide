package theory.grammar.stream.obtain_stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * Function:
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

    }
}
