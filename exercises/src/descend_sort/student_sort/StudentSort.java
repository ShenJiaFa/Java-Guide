package descend_sort.student_sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Function: Student descend sort
 *
 * Author: ShenJiaFa
 * Since: 2022/3/31-19:28
 */
public class StudentSort {
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
