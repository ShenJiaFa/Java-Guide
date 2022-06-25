package com.shenjiafa.practice.complex_practice.simulate_cinema.bean;

/**
 * Function: User bean
 *
 * @author ShenJiaFa
 * @since 2022/4/10
 */
public class User {

    /**
     * User Login name
     */
    private String loginName;

    /**
     * User password
     */
    private String password;

    /**
     * User name
     */
    private String userName;

    /**
     * User gender
     */
    private String gender;

    /**
     * User phone
     */
    private String phone;

    /**
     * User money
     */
    private double money;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public User(String loginName, String password, String userName, String gender, String phone, double money) {
        this.loginName = loginName;
        this.password = password;
        this.userName = userName;
        this.gender = gender;
        this.phone = phone;
        this.money = money;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                ", money=" + money +
                '}';
    }

}
