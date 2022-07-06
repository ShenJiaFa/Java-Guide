package com.shenjiafa.theory.annotation.meta_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = {ElementType.TYPE,ElementType.METHOD})
public @interface MyAnnotationDecoratedByMetaAnnotation {

}
