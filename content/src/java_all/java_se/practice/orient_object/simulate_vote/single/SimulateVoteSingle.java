package java_all.java_se.practice.orient_object.simulate_vote.single;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Function: Simulate single vote
 *
 * @author: ShenJiaFa
 * @since: 2022/4/5
 */
public class SimulateVoteSingle {
    public static void main(String[] args) {

        // Create operational data
        Character[] characters = {'A', 'B', 'C', 'D'};
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < 80; i++) {
            sb.append(characters[rand.nextInt(4)]);
        }

        // Define a map to hold the result
        Map<Character, Integer> voteMap = new HashMap<>();

        // Start assemble vote map
        for (int i = 0; i < sb.length(); i++) {
            Character key = sb.charAt(i);
            if(!voteMap.containsKey(key)) {
                voteMap.put(key, 1);
                continue;
            }
            voteMap.put(key, voteMap.get(key)+1);
        }

        System.out.println(voteMap);

    }
}
