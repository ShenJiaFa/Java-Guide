package design_pattern.singleton;

/**
 * Function: Runner class
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class CreateSingleton {
    public static void main(String[] args) {

        //Use hungry Singleton
        HungrySingleton instance1 = HungrySingleton.instance;
        HungrySingleton instance2 = HungrySingleton.instance;
        System.out.println(instance1 == instance2);

        //User lazy Singleton
        LazySingleton instance3 = LazySingleton.getInstance();
        LazySingleton instance4 = LazySingleton.getInstance();
        System.out.println(instance3 == instance4);

    }
}
