package com.shenjiafa.theory.annotation.parse_annotation;

/**
 * Function: BookStore class
 *
 * @author ShenJiaFa
 * @since 2022/6/1
 */
@MyBook(value = "Java Guide V1",price = 99.9,authors = {"JiaFaShen"})
public class BookStore {
    @MyBook(value = "Java Guide V2",price = 199.9,authors = {"JiaFaShen","newer"})
    public void bookStore(){
    }
}
