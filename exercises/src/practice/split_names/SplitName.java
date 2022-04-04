package practice.split_names;

import java.util.Arrays;

/**
 * Function: Extract person's name
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class SplitName {
    public static void main(String[] args) {

        //Source data
        String nameString="刘一|||李二|||张三|||李四|||王五|||崔六|||孙七|||嘎八|||周九|||赵十";

        //Write Regex
        String regex="\\|\\|\\|";

        //Start split
        String[] names=nameString.split(regex);

        //print the acquired name
        System.out.println(Arrays.toString(names));
    }
}
