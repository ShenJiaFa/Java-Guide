package com.shenjiafa.practice.orient_object.performance_statistic;

/**
 * Function: UserService interface
 *
 * @author ShenJiaFa
 * @since 2022/6/19
 */
public interface UserService {

    void login(String loginName, String password);

    void deleteUsers();

    String selectUsers();
}
