package com.shenjiafa.theory.jdbc.simplify_jdbc.util;

import com.shenjiafa.theory.jdbc.simplify_jdbc.RunSimplifyJdbc;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * Function: Jdbc util class
 *
 * @author ShenJiaFa
 * @since 2022/7/26
 */
public class JdbcUtil {

    /**
     * Jdbc driver
     */
    private static String driver;

    /**
     * The database url
     */
    private static String url;

    /**
     * The database user
     */
    private static String user;

    /**
     * The database password
     */
    private static String password;

    static {
        try {
            Properties pro = new Properties();
            ClassLoader classLoader = RunSimplifyJdbc.class.getClassLoader();
            String path = classLoader.getResource("com/shenjiafa/theory/jdbc/simplify_jdbc/resource/Jdbc.properties").getPath();
            pro.load(new FileReader(path));
            driver = pro.getProperty("driver");
            url = pro.getProperty("url");
            user = pro.getProperty("user");
            password = pro.getProperty("password");
            Class.forName(driver);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Get connection
     *
     * @return Connection
     * @throws SQLException SQL exception
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    /**
     * Close resource
     *
     * @param rs   ResultSet
     * @param stmt Statement
     * @param conn Connection
     */
    public static void close(ResultSet rs, Statement stmt, Connection conn) {
        if (null != rs) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (null != stmt) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (null != conn) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Close resource
     *
     * @param stmt Statement
     * @param conn Connection
     */
    public static void close(Statement stmt, Connection conn) {
        if (null != stmt) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (null != conn) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
