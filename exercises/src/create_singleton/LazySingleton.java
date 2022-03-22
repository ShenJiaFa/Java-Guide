package create_singleton;

/**
 * Function: Lazy Singleton Pattern
 *
 * Author: ShenJiaFa
 * Since: 2022/3/19-20:05
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
