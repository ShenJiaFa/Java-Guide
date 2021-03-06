package com.shenjiafa.theory.design_patterns.singleton;

/**
 * Function: Hungry Singleton Pattern
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
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
