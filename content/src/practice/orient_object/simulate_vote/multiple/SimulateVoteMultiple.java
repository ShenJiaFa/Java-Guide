package practice.orient_object.simulate_vote.multiple;

import java.util.*;

/**
 * Function: Simulate multiple vote
 *
 * @author: ShenJiaFa
 * @since: 2022/4/5
 */
public class SimulateVoteMultiple {
    public static void main(String[] args) {

        // Create a list to hold all student's options
        List<List<Character>> students = new ArrayList<>();

        // Create an array to hold all options and assemble students
        Character[] characters = {'A', 'B', 'C', 'D'};
        for (int i = 0; i < 80; i++) {
            List<Character> characterList = new ArrayList<>();
            for (Character character : characters) {
                if (isValidRandom()) {
                    characterList.add(character);
                }
            }
            students.add(characterList);
        }

        // Define multiple options and summary options vote map
        Map<List<Character>, Integer> voteMapMultiple = new HashMap<>();
        Map<Character, Integer> voteMapSingle = new HashMap<>();

        // Assemble vote map
        for (List<Character> student : students) {
            //Assemble multiple options
            if (voteMapMultiple.containsKey(student)) {
                voteMapMultiple.put(student, voteMapMultiple.get(student) + 1);
            } else {
                voteMapMultiple.put(student, 1);
            }
            // Assemble summary option
            for (Character character : student) {
                Character key = character;
                if (!voteMapSingle.containsKey(key)) {
                    voteMapSingle.put(key, 1);
                    continue;
                }
                voteMapSingle.put(key, voteMapSingle.get(key) + 1);
            }
        }

        System.out.println("The multiple choice result is:");
        System.out.println(voteMapMultiple);
        System.out.println("Summary result is:");
        System.out.println(voteMapSingle);

    }

    /**
     * Generate random boolean
     * @return Random boolean
     */
    public static Boolean isValidRandom() {
        Random rd = new Random();
        return rd.nextInt(2) == 1;
    }

}
