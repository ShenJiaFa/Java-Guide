package format_output.generic;

/**
 * Function:
 * <p>
 * Author: ShenJiaFa
 * Since: 2022/4/2-22:51
 */
public class Apple {
    /**
     * Apple name
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Apple(String name) {
        this.name = name;
    }

    public Apple() {
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                '}';
    }
}
