package com.shenjiafa.theory.design_patterns.factory.base;

/**
 * Function: Computer model class
 *
 * @author ShenJiaFa
 * @since 2022/6/21
 */
public abstract class Computer {
    /**
     * Computer name
     */
    private String name;

    /**
     * Computer price
     */
    private double price;

    public abstract void start();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Computer() {
    }

    public Computer(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
