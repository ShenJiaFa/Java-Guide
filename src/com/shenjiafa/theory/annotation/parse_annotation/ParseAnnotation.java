package com.shenjiafa.theory.annotation.parse_annotation;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Function: Parse annotation
 *
 * @author ShenJiaFa
 * @since 2022/6/1
 */
public class ParseAnnotation {

    @Test
    public void parseAnnotation() throws NoSuchMethodException {

        Class bookStoreClass = BookStore.class;
        Method bookStoreMethodClass = bookStoreClass.getDeclaredMethod("bookStore");

        if (bookStoreClass.isAnnotationPresent(MyBook.class)) {
            MyBook myBookAnnotation = (MyBook) bookStoreClass.getDeclaredAnnotation(MyBook.class);
            System.out.println(myBookAnnotation.value() + " : " + myBookAnnotation.price() + " : " + Arrays.toString(myBookAnnotation.authors()));
        }

        if (bookStoreMethodClass.isAnnotationPresent(MyBook.class)) {
            MyBook myBookAnnotation = (MyBook) bookStoreMethodClass.getDeclaredAnnotation(MyBook.class);
            System.out.println(myBookAnnotation.value() + " : " + myBookAnnotation.price() + " : " + Arrays.toString(myBookAnnotation.authors()));
        }

    }
}
