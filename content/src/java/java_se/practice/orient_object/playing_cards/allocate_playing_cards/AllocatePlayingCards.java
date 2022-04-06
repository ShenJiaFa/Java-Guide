package java.java_se.practice.orient_object.playing_cards.allocate_playing_cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Function: Allocate playing cards
 *
 * @author: ShenJiaFa
 * @since: 2022/4/4
 */
public class AllocatePlayingCards {

    /**
     * Define a static collection to hold 54 playing cards
     */
    public static List<Card> playingCards = new ArrayList<>();

    /**
     * Define a static block of code to initialize card data
     */
    static {
        // Value array and color array
        String[] names = {"3", "4", "5", "6", "7", "8", "9", "10", "j", "q", "k", "A", "2"};
        String[] color = {"♥", "♠", "◆", "♣"};

        // Create card's value
        int value = 0;

        // Assembling playing cards
        for (String name : names) {
            for (String s : color) {
                playingCards.add(new Card(name, s, value));
            }
            value++;
        }
        Card cardJoker = new Card("Joker", "", ++value);
        Card cardJOKER = new Card("JOKER", "", ++value);

        Collections.addAll(playingCards, cardJoker, cardJOKER);
    }

    public static void main(String[] args) {

        // Shuffle playing cards
        Collections.shuffle(playingCards);

        // Define three players
        List<Card> John = new ArrayList<>();
        List<Card> Bill = new ArrayList<>();
        List<Card> Lily = new ArrayList<>();

        // Start allocate playing cards
        for (int i = 0; i < playingCards.size() - 3; i++) {

            switch (i % 3) {
                case 0:
                    John.add(playingCards.get(i));
                    break;
                case 1:
                    Bill.add(playingCards.get(i));
                    break;
                case 2:
                    Lily.add(playingCards.get(i));
                    break;
                default:
                    System.out.println("SYSTEM ERROR!");
            }
        }

        // Get the last three cards
        List<Card> lastThreeCards = playingCards.subList(playingCards.size() - 3, playingCards.size());

        // Each player sorts the cards
        sortCars(John);
        sortCars(Bill);
        sortCars(Lily);

        // Print Each player's cards
        System.out.println("John's cards: " + John);
        System.out.println("Bill's cards: " + Bill);
        System.out.println("Lily's cards: " + Lily);
        System.out.println("Last three cards: " + lastThreeCards);

    }

    /**
     * Sort cards method
     *
     * @param player Player
     */
    private static void sortCars(List<Card> player) {
        player.sort(Comparator.comparingInt(Card::getValue));
    }

}
