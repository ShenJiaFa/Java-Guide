package com.shenjiafa.theory.annotation.create_annotation;

/**
 * Function: MyPencil
 *
 * @author ShenJiaFa
 * @since 2022/5/31
 */
public @interface MyPencil {
    String value();
    double price() default 9.9;
}
