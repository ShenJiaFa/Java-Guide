package com.shenjiafa.practice.complex_practice.simulate_cinema.bean;

/**
 * Function: Business bean class
 *
 * @author ShenJiaFa
 * @since 2022/4/10
 */
public class Business extends User {

    /**
     * Shop name
     */
    private String shopName;

    /**
     * Shop address
     */
    private String shopAddress;

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public Business(String loginName, String password, String userName, String gender, String phone, double money, String shopName, String shopAddress) {
        super(loginName, password, userName, gender, phone, money);
        this.shopName = shopName;
        this.shopAddress = shopAddress;
    }

    public Business() {
    }

    @Override
    public String toString() {
        return "Business{" +
                "shopName='" + shopName + '\'' +
                ", shopAddress='" + shopAddress + '\'' +
                '}';
    }

}
