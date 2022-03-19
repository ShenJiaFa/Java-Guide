package create_singleton;

/**
 * Function: Runner class
 *
 * Author: ShenJiaFa
 * Since: 2022/3/19-20:09
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
