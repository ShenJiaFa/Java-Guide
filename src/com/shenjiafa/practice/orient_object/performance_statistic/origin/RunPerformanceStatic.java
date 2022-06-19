package com.shenjiafa.practice.orient_object.performance_statistic.origin;

/**
 * Function: Run performance static
 *
 * @author ShenJiaFa
 * @since 2022/6/19
 */
public class RunPerformanceStatic {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        userService.login("admin", "123");
        userService.selectUsers();
        userService.deleteUsers();

    }
}
