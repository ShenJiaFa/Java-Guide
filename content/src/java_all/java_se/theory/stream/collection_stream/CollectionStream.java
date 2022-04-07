package java_all.java_se.theory.stream.collection_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Function: Collection stream
 *
 * @author: ShenJiaFa
 * @since: 2022/4/6
 */
public class CollectionStream {
    public static void main(String[] args) {
        // Create operational data
        List<String> names = new ArrayList<String>();
        names.add("Tom");
        names.add("Jim");
        names.add("Bill");
        names.add("Lily");
        names.add("David");
        names.add("Eric");
        names.add("Bob");
        names.add("John");
        names.add("Jim");

        // Filter to get names starting with J to list
        List<String> JList = names.stream().filter(n -> n.startsWith("J")).collect(Collectors.toList());
        System.out.println(JList);

        System.out.println("----------------------------");

        // Filter to get names starting with J to set
        Set<String> JSet = names.stream().filter(n -> n.startsWith("J")).collect(Collectors.toSet());
        System.out.println(JSet);

        System.out.println("----------------------------");

        // Filter to get names starting with J to array
        String[] JArray = names.stream().filter(n -> n.startsWith("J")).toArray(s->new String[s]);
        System.out.println(Arrays.toString(JArray));


    }
}
