package create_singleton;

/**
 * Function: Hungry Singleton Pattern
 *
 * Author: ShenJiaFa
 * Since: 2022/3/19-20:04
 */
public class HungrySingleton {

    /**
     * Instance
     */
    public static HungrySingleton instance = new HungrySingleton();

    /**
     * Constructor privatization
     */
    private HungrySingleton() {

    }
}
