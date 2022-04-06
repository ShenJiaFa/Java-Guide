package java_all.java_se.theory.stream.obtain_stream;

import java.util.ArrayList;
import java.util.List;

/**
 * Function:
 *
 * @author: ShenJiaFa
 * @since: 2022/4/6
 */
public class OperateStream {
    public static void main(String[] args) {

     // prefabricate data
        List<String> nameList = new ArrayList<>();
        nameList.add("张三丰");
        nameList.add("Tom");
        nameList.add("Eric");
        nameList.add("Lily");
        nameList.add("David");
        nameList.add("Bill");
        nameList.add("John");
        nameList.add("Bob");

        nameList.stream().filter(s ->s.startsWith("张")).forEach(System.out::println);


    }
}
