package java.java_se.practice.orient_object.playing_cards.allocate_playing_cards;

/**
 * Function: Card model
 *
 * @author: ShenJiaFa
 * @since: 2022/4/4
 */
public class Card {
    /**
     * The name of playing cards
     */
    private String name;

    /**
     * The color of playing cards
     */
    private String color;

    /**
     * The value of playing cards
     */
    private int value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Card(String name, String color,int value) {
        this.name = name;
        this.color = color;
        this.value=value;
    }

    public Card() {
    }

    @Override
    public String toString() {
        return color + name;
    }

}
