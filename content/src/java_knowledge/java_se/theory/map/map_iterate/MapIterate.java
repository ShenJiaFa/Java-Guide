package java_knowledge.java_se.theory.map.map_iterate;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Function: Iterate map
 *
 * @author: ShenJiaFa
 * @since: 2022/4/5
 */
public class MapIterate {
    public static void main(String[] args) {

        // Create a map and put some data
        Map<String, Integer> items = new HashMap<>();
        items.put("Red Bull (300ml)", 1);
        items.put("Coca Cola (600ml)", 24);
        items.put("Nestle Coffee (240ml)", 18);

        // Method1: Iterate map by iterating all keys;
        System.out.println("Method1:Iterate map by iterating all keys:");

        // Get all keys
        Set<String> keys = items.keySet();

        // Start Iterate
        for (String key : keys) {
            System.out.println(key + " X " + items.get(key));
        }

        System.out.println("-----------------------------------------");

        // Method2: Iterate map by iterating entries
        System.out.println("Method2:Iterate map by iterating entries:");

        Set<Map.Entry<String, Integer>> entries = items.entrySet();

        // Start Iterate
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "X" + entry.getValue());
        }

        System.out.println("-----------------------------------------");

        // Method3:Iterate map by using lambda expression
        System.out.println("Method3:Iterate map by using lambda expression");

        // Use lambda
        items.forEach((k, v) -> System.out.println(k + "X" + v));

    }
}
