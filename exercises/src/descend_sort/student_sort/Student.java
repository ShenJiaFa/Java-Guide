package descend_sort.student_sort;

/**
 * Function: Student model class
 *
 * Author: ShenJiaFa
 * Since: 2022/3/31-19:25
 */
public class Student {

    /**
     * Student name
     */
    private String name;

    /**
     * Student name
     */
    private Integer age;

    /**
     * Student height
     */
    private Double height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Student(String name, Integer age, Double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

}
