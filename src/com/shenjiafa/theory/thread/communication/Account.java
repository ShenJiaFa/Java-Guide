package com.shenjiafa.theory.thread.communication;

/**
 * Function: Account model class
 *
 * @author ShenJiaFa
 * @since 2022/5/6
 */
public class Account {
    /**
     * Bank card id
     */
    private String cardId;

    /**
     * Account balance
     */
    private double balance;

    public Account() {
    }

    public Account(String cardId, double balance) {
        this.cardId = cardId;
        this.balance = balance;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Withdraw money
     *
     * @param money Money
     */
    public synchronized void withDraw(double money) {

        try {
            String name = Thread.currentThread().getName();
            if (this.balance >= money) {
                balance -= money;
                System.out.println(name + " withdraw " + money + " success!");
                System.out.println("The balance is " + this.balance);
            }
            this.notifyAll();
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    /**
     * Deposit money
     *
     * @param money Money
     */
    public synchronized void deposit(double money) {
        try {
            String name = Thread.currentThread().getName();
            if (this.balance == 0) {
                this.balance += money;
                System.out.println(name + " deposit " + money + " success!");
                System.out.println("The balance is " + this.balance);
            }
            this.notifyAll();
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
