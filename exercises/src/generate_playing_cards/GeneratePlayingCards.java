package generate_playing_cards;

import java.util.ArrayList;
import java.util.List;

/**
 * Function: generate the only set of playing cards (including suits)
 *
 * Author: ShenJiaFa
 * Since: 2022/3/19-18:59
 */
public class GeneratePlayingCards {
    /**
     * The only set of playing cards in the system
     */
    public static List<String> cards = new ArrayList<>();

    /**
     * Generate playing cards
     */
    static {
        String card;
        String[] values = {"3", "4", "5", "6", "7", "8", "9", "10", "j", "q", "k", "A", "2"};
        String[] suits = {"♥", "♠", "◆", "♣"};
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                card = "[" + suits[j] + values[i] + "]";
                cards.add(card);
            }
        }
        cards.add("[joker]");
        cards.add("[JOKER]");
    }

    public static void main(String[] args) {
        //Print the generated playing cards
        System.out.println(cards);
    }
}
