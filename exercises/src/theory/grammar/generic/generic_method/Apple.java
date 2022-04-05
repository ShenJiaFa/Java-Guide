package theory.grammar.generic.generic_method;

/**
 * Function: Apple model
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
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
