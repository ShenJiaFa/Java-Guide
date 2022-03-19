package screening_score;

import java.util.ArrayList;
import java.util.List;

/**
 * Function: Screen score blow 80
 *
 * Author: ShenJiaFa
 * Since: 2022/3/13-13:45
 */
public class ScreeningScore {
    public static void main(String[] args) {
        //Create a list to store these scores
        List<Integer> scoreList= new ArrayList<>();
        scoreList.add(98);
        scoreList.add(77);
        scoreList.add(66);
        scoreList.add(89);
        scoreList.add(79);
        scoreList.add(50);
        scoreList.add(100);
        //Create a new list to hold satisfactory score
        List<Integer> qualifiedScoreList=new ArrayList<>();
        for(Integer i:scoreList){
            if(i>=80){
                qualifiedScoreList.add(i);
            }
        }
        System.out.println(qualifiedScoreList);
    }
}
