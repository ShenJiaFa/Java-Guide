package com.shenjiafa.theory.stream.operate_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Function: Operate stream
 *
 * @author: ShenJiaFa
 * @since: 2022/4/6
 */
public class OperateStream {
    public static void main(String[] args) {

        // Create operational data
        List<String> nameList = new ArrayList<>();
        nameList.add("Jim");
        nameList.add("Tom");
        nameList.add("Eric");
        nameList.add("Lily");
        nameList.add("David");
        nameList.add("Bill");
        nameList.add("John");
        nameList.add("Bob");

        // Filter to get names starting with J
        nameList.stream().filter(s -> s.startsWith("J")).forEach(System.out::println);

        System.out.println("---------");

        // Filter to get names of length 3
        long count = nameList.stream().filter(s -> s.length() == 3).count();
        System.out.println(count);

        System.out.println("---------");

        // Filter to get names starting with J limit 1
        nameList.stream().filter(s -> s.startsWith("J")).limit(1).forEach(System.out::println);

        System.out.println("---------");


        // Filter to get names starting with J skip 1
        nameList.stream().filter(s -> s.startsWith("J")).skip(1).forEach(System.out::println);

        System.out.println("---------");

        // Add Lovely to the front of the collection elements
        nameList.stream().map(s -> "Lovely " + s).forEach(System.out::println);

        System.out.println("---------");

        // Process the name into a student object
        nameList.stream().map(s -> new Student(s)).forEach(s -> System.out.println(s));

        System.out.println("---------");

        // Merge streams
        Stream<String> JStream = nameList.stream().filter(s -> s.startsWith("J"));
        Stream<String> BStream = nameList.stream().filter(s -> s.startsWith("B"));
        Stream<String> JBStream = Stream.concat(JStream, BStream);
        JBStream.forEach(e -> System.out.println(e));


    }
}
