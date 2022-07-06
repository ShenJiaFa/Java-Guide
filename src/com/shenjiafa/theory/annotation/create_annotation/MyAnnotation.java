package com.shenjiafa.theory.annotation.create_annotation;

import com.shenjiafa.theory.annotation.create_annotation.annotation_type.Animal;
import com.shenjiafa.theory.annotation.create_annotation.enum_type.Season;

/**
 * Create custom annotation
 */
public @interface MyAnnotation {

    // The return type of the property:
    // 1.Basic type
    int basicTypeMethod();

    // 2.String
    String stringTypeMethod();

    // 3.Enum
    Season enumTypeMethod();

    // 4.Annotation
    Animal annotationTypeMethod();

    // 5.Arrays of the above types
    String[] arrayTypeMethod();
}
