package com.shenjiafa.theory.jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Function: Use jdbc to create date from database
 *
 * @author ShenJiaFa
 * @since 2022/7/25
 */
public class JdbcCreate {
    public static void main(String[] args) {
        Statement statement = null;
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String sql = "insert into t_user values(null,'Jim')";
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_guide", "root", "root");
            statement = connection.createStatement();
            int count = statement.executeUpdate(sql);
            System.out.println(count);
            System.out.println(count > 0 ? "Add successfully" : "Add failed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (null != statement) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (null != connection) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
