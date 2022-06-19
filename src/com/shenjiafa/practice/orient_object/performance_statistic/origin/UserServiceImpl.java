package com.shenjiafa.practice.orient_object.performance_statistic.origin;

import java.util.Objects;

/**
 * Function: UserService implementation class
 *
 * @author ShenJiaFa
 * @since 2022/6/19
 */
public class UserServiceImpl implements UserService {

    @Override
    public String login(String loginName, String password) {
        long startTime = System.currentTimeMillis();
        System.out.println("User is logging in");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String rs = "Login Failed!";
        if (Objects.equals(loginName, "admin") && Objects.equals(password, "123")) {
            rs = "Login Success!";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Login method spend" + (endTime - startTime) / 1000.0 + "s");
        return rs;
    }

    @Override
    public void deleteUsers() {
        long startTime = System.currentTimeMillis();
        System.out.println("Deleting all user's expired data");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("DeleteUsers method spend" + (endTime - startTime) / 1000.0 + "s");
    }

    @Override
    public void selectUsers() {
        long startTime = System.currentTimeMillis();
        System.out.println("Selecting all user's expired data");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("SelectUsers method spend" + (endTime - startTime) / 1000.0 + "s");
    }
}
