package com.shenjiafa.practice.orient_object.performance_statistic.origin;

/**
 * Function: UserService interface
 *
 * @author ShenJiaFa
 * @since 2022/6/19
 */
public interface UserService {

    String login(String loginName, String password);

    void deleteUsers();

    void selectUsers();
}
