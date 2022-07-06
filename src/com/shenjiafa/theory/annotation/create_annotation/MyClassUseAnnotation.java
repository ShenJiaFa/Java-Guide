package com.shenjiafa.theory.annotation.create_annotation;

import com.shenjiafa.theory.annotation.create_annotation.annotation_type.Animal;
import com.shenjiafa.theory.annotation.create_annotation.enum_type.Season;

/**
 * Function: Use custom annotations and assign values to annotation properties
 *
 * @author ShenJiaFa
 * @since 2022/7/6
 */
@MyAnnotation(basicTypeMethod = 1,stringTypeMethod = "abc",enumTypeMethod = Season.summer,annotationTypeMethod = @Animal,arrayTypeMethod = {"abc","def","ghi"})
public class MyClassUseAnnotation {
}
