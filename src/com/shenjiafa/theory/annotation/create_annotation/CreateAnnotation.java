package com.shenjiafa.theory.annotation.create_annotation;

/**
 * Function: Create annotation
 *
 * @author ShenJiaFa
 * @since 2022/5/31
 */
@MyPencil("Pencil")
@MyBook(name = "Java Guide", authors = {"JiaFaShen"}, price = 188.88)
public class CreateAnnotation {
    @MyTest
    private String field;

    @MyTest
    @MyPencil("Pencil")
    @MyBook(name = "Java Guide", authors = {"JiaFaShen"}, price = 188.88)
    public void method(@MyPencil("Pencil") @MyBook(name = "Java Guide", authors = {"JiaFaShen"}, price = 188.88) int num) {
    }
}
