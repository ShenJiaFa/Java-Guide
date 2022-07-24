package com.shenjiafa.theory.jdbc.quick_start;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Function: JDBC quick start
 *
 * @author ShenJiaFa
 * @since 2022/7/24
 */
public class JdbcQuickStart {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_guide", "root", "root");
        String sql = "update t_user set name='Jack' where id=1";

        Statement statement = connection.createStatement();
        int count = statement.executeUpdate(sql);

        System.out.println(count);

        connection.close();
        statement.close();
    }
}
