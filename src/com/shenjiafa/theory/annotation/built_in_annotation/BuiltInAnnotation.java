package com.shenjiafa.theory.annotation.built_in_annotation;

/**
 * Function: Demonstrate JDK built-in annotations
 *
 * @author ShenJiaFa
 * @since 2022/7/6
 */
@SuppressWarnings("all")
public class BuiltInAnnotation {

    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void oldMethod() {
        System.out.println("This is a old method.");
    }

    public void newMethod() {
        System.out.println("This is a new method.");
    }

}
