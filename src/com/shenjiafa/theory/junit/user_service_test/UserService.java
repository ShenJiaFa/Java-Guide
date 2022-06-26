package com.shenjiafa.theory.junit.user_service_test;

/**
 * Function: Simulate some business code
 *
 * @author ShenJiaFa
 * @since 2022/5/26
 */
public class UserService {

    /**
     * Simulate user login
     *
     * @param userName username
     * @param password password
     * @return result
     */
    public String UserLogin(String userName, String password) {
        if ("admin".equals(userName) && "123456".equals(password)) {
            return "success";
        } else {
            return "fail";
        }
    }

    /**
     * Simulate a user exception method
     */
    public void UserXXX() {
        System.out.println(10 / 0);
    }

}
