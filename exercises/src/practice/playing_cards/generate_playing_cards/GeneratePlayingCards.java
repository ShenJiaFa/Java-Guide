package practice.playing_cards.generate_playing_cards;

import java.util.ArrayList;
import java.util.List;

/**
 * Function: generate the only set of playing cards (including suits)
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
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
        String[] color = {"♥", "♠", "◆", "♣"};
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < color.length; j++) {
                card = "[" + color[j] + values[i] + "]";
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
