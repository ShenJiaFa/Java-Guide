package com.shenjiafa.theory.annotation.create_annotation;

/**
 * Function: MyBook
 *
 * @author ShenJiaFa
 * @since 2022/5/31
 */
public @interface MyBook {
    String name();

    String[] authors();

    double price();
}
