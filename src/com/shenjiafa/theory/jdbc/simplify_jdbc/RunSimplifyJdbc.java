package com.shenjiafa.theory.jdbc.simplify_jdbc;

import com.shenjiafa.theory.jdbc.simplify_jdbc.model.Student;
import com.shenjiafa.theory.jdbc.simplify_jdbc.util.JdbcUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Function: Run simplify Jdbc
 *
 * @author ShenJiaFa
 * @since 2022/7/26
 */
public class RunSimplifyJdbc {
    public static void main(String[] args) {
        System.out.println("Start Query!");
        System.out.println(getStudents());
    }

    public static List<Student> getStudents() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        List<Student> studentList = null;
        try {
            String sql = "select * from t_student";
            connection = JdbcUtil.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            studentList = new ArrayList<>();
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                double height = resultSet.getDouble("height");
                Date admissionDate = resultSet.getDate("admission_date");
                Student student = new Student();
                student.setId(id);
                student.setName(name);
                student.setAge(age);
                student.setHeight(height);
                student.setAdmissionDate(admissionDate);
                studentList.add(student);
            }
            return studentList;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(resultSet, statement, connection);
        }
        return studentList;
    }
}
