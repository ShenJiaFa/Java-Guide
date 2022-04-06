package java_all.java_se.practice.orient_object.employee_analysis;

import java.util.List;

/**
 * Function: Employee model
 *
 * @author: ShenJiaFa
 * @since: 2022/4/6
 */
public class Employee {

    /**
     * Employee name
     */
    private String name;

    /**
     * Employee gender
     */
    private String gender;

    /**
     * Employee salary
     */
    private Integer salary;

    /**
     * Employee bonus
     */
    private Integer bonus;

    /**
     * Employee reward and punishment record
     */
    private List<String> records;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public List<String> getRecords() {
        return records;
    }

    public void setRecords(List<String> records) {
        this.records = records;
    }

    public Employee(String name, String gender, Integer salary, Integer bonus, List<String> records) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.bonus = bonus;
        this.records = records;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", records=" + records +
                '}';
    }

}
