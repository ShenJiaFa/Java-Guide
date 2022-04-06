package design_pattern.singleton;

/**
 * Function: Lazy Singleton Pattern
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class LazySingleton {

    /**
     * Instance
     */
    private static LazySingleton instance;

    /**
     * Constructor privatization
     */
    private LazySingleton() {

    }

    /**
     * Get instance
     *
     * @return Instance
     */
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
