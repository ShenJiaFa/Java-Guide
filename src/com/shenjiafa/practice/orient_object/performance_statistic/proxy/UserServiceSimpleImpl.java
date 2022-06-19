package com.shenjiafa.practice.orient_object.performance_statistic.proxy;

import com.shenjiafa.practice.orient_object.performance_statistic.origin.UserService;

import java.util.Objects;

/**
 * Function: UserService simple implementation class
 *
 * @author ShenJiaFa
 * @since 2022/6/19
 */
public class UserServiceSimpleImpl implements UserService {

    @Override
    public String login(String loginName, String password) {
        System.out.println("User login in !");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String rs = "Login Failed !";
        if (Objects.equals(loginName, "admin") && Objects.equals(password, "123")) {
            rs = "Login Success !";
        }
        return rs;
    }

    @Override
    public void deleteUsers() {
        System.out.println("Deleting all user's expired data !");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void selectUsers() {
        System.out.println("Selecting all user's expired data !");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
