package com.shenjiafa.practice.orient_object.performance_statistic.proxy;

import com.shenjiafa.practice.orient_object.performance_statistic.origin.UserService;

/**
 * Function: Run performanceStatic by proxy
 *
 * @author ShenJiaFa
 * @since 2022/6/19
 */
public class RunPerformanceStaticByProxy {
    public static void main(String[] args) {

        UserService userService=ProxyUtil.getProxy(new UserServiceSimpleImpl());
        userService.login("admin", "123");
        userService.selectUsers();
        userService.deleteUsers();

    }
}
