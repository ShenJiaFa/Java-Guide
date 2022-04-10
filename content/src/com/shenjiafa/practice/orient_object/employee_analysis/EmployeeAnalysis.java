package com.shenjiafa.practice.orient_object.employee_analysis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Function: Employee analysis
 *
 * @author: ShenJiaFa
 * @since: 2022/4/6
 */
public class EmployeeAnalysis {
    /**
     * The sum of salary
     */
    public static Integer sum = 0;

    public static void main(String[] args) {

        // Create data for department 1
        List<Employee> department1 = new ArrayList<>();
        List<String> record1 = new ArrayList<>();
        record1.add("Model Worker");
        record1.add("Excellent Staff");
        department1.add(new Employee("Jim", "Male", 3000, 10000, record1));
        List<String> record2 = new ArrayList<>();
        record2.add("Excellent Staff");
        department1.add(new Employee("Tom", "Male", 2500, 6000, record2));
        List<String> record3 = new ArrayList<>();
        department1.add(new Employee("Bob", "Male", 1600, 3000, record3));
        List<String> record4 = new ArrayList<>();
        record4.add("Negative Work");
        record4.add("Late For Work");
        department1.add(new Employee("Lily", "Female", 1500, 0, record4));

        // Create data for department 2
        List<Employee> department2 = new ArrayList<>();
        List<String> record5 = new ArrayList<>();
        record5.add("Model Worker");
        record5.add("Technical Experts");
        record5.add("Excellent Staff");
        department2.add(new Employee("David", "Male", 5000, 15000, record5));
        List<String> record6 = new ArrayList<>();
        record2.add("Efficiency Master");
        department2.add(new Employee("Jack", "Male", 2500, 5000, record6));
        List<String> record7 = new ArrayList<>();
        department2.add(new Employee("Eric", "Male", 1700, 3500, record7));
        List<String> record8 = new ArrayList<>();
        record4.add("Late For Work");
        department2.add(new Employee("Amy", "Female", 1600, 0, record8));
        List<String> record9 = new ArrayList<>();
        record4.add("Negative Work");
        department2.add(new Employee("Richard", "Male", 1400, 0, record9));

        // Package top performer
        System.out.println("Two TopPerformers are:");
        System.out.println(department1.stream().max((e1, e2) -> (e1.getSalary() * 12 + e1.getBonus()) - (e2.getSalary() * 12 + e2.getBonus())).map(e -> new TopPerformer(10001, e)).get());
        System.out.println(department2.stream().max((e1, e2) -> (e1.getSalary() * 12 + e1.getBonus()) - (e2.getSalary() * 12 + e2.getBonus())).map(e -> new TopPerformer(10002, e)).get());

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        // Statistic average salary of each department
        department1.stream().sorted((e1, e2) -> e2.getSalary() - e1.getSalary()).skip(1).limit(2).forEach(e -> {
            sum += e.getSalary();
        });
        System.out.println("The average salary of department 1 is:");
        System.out.println("$" + sum / (department1.size() - 2));
        sum = 0;
        department2.stream().sorted((e1, e2) -> e2.getSalary() - e1.getSalary()).skip(1).limit(3).forEach(e -> {
            sum += e.getSalary();
        });
        System.out.println("The average salary of department 2 is:");
        System.out.println("$" + sum / (department2.size() - 2));
        sum = 0;

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        // Statistic average salary of the two departments after the merger
        Stream.concat(department1.stream(), department2.stream()).sorted((e1, e2) -> e2.getSalary() - e1.getSalary()).skip(1).limit(7).forEach(e -> {
            sum += e.getSalary();
        });
        System.out.println("The average salary of the two departments after the merger is:");
        System.out.println("$" + sum / (department1.size() + department2.size() - 2));

    }
}
