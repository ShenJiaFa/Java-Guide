package com.shenjiafa.theory.annotation.meta_annotation;

import java.lang.annotation.*;

/**
 * Show annotation decorated by meta-annotations
 */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAnnotationDecoratedByMetaAnnotation {
}
