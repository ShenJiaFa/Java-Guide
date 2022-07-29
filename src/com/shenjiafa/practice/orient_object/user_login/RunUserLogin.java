package com.shenjiafa.practice.orient_object.user_login;

import com.mysql.cj.util.StringUtils;
import com.shenjiafa.theory.jdbc.simplify_jdbc.util.JdbcUtil;

import java.sql.*;
import java.util.Scanner;

/**
 * Function: Simulate user login
 *
 * @author ShenJiaFa
 * @since 2022/7/28
 */
public class RunUserLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username:");
        String userName = scanner.nextLine();
        System.out.println("Please enter your password:");
        String password = scanner.nextLine();
        System.out.println(login(userName, password) ? "login successful!" : "Login failed!");
    }

    /**
     * User login method
     *
     * @return Login result
     */
    public static boolean login(String userName, String password) {
        if (StringUtils.isNullOrEmpty(userName) || StringUtils.isNullOrEmpty(password)) {
            return false;
        }
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            String sql = "select * from t_user_login where user_name= ? and user_password= ?";
            connection = JdbcUtil.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,userName);
            preparedStatement.setString(2,password);
            resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(resultSet, preparedStatement, connection);
        }
        return false;
    }
}
