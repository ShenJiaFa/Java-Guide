package com.shenjiafa.theory.array.arrays_util.array_util_sort.student_array_sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Function: Student descend sort
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class StudentArraySort {
    public static void main(String[] args) {

        // Create student array
        Student[] students = {new Student("李宗盛", 52, 169.5), new Student("周杰伦", 36, 171.3), new Student("刘德华", 58, 168.3)};

        // Sort by age in descending order
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        System.out.println("Sort by age in descending order: " + Arrays.toString(students));

        // Sort by height in descending order
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o2.getHeight(), o1.getHeight());
            }
        });
        System.out.println("Sort by height in descending order: " + Arrays.toString(students));

    }
}
