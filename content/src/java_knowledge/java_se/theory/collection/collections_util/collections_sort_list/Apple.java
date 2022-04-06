package java_knowledge.java_se.theory.collection.collections_util.collections_sort_list;

/**
 * Function: Apple model
 *
 * @author: ShenJiaFa
 * @since: 2022/4/4
 */
public class Apple implements Comparable<Apple> {
    /**
     * Apple name
     */
    private String name;

    /**
     * Apple color
     */
    private String color;

    /**
     * Apple price
     */
    private double price;

    /**
     * Apple defectCount
     */
    private int defectCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDefectCount() {
        return defectCount;
    }

    public void setDefectCount(int defectCount) {
        this.defectCount = defectCount;
    }

    public Apple(String name, String color, double price, int defectCount) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.defectCount = defectCount;
    }

    public Apple() {
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", defectCount=" + defectCount +
                '}';
    }

    @Override
    public int compareTo(Apple o) {
        return Double.compare(this.price, o.price);
    }
}
