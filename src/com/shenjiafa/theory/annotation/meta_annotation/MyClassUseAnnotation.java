package com.shenjiafa.theory.annotation.meta_annotation;

/**
 * Function: Show class using annotations
 *
 * @author ShenJiaFa
 * @since 2022/7/7
 */
@MyAnnotationDecoratedByMetaAnnotation
public class MyClassUseAnnotation {
    @MyAnnotationDecoratedByMetaAnnotation
    private String myField;

    @MyAnnotationDecoratedByMetaAnnotation
    public void myMethod() {

    }
}
