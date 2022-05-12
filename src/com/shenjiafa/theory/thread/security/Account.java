package com.shenjiafa.theory.thread.security;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

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

    /**
     * Lock
     */
    private Lock lock=new ReentrantLock();

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
     * WithDraw money
     *
     * @param money Money
     */
    public void withDraw(double money) {

        String name = Thread.currentThread().getName();

        lock.lock();

        try {
            if (this.balance >= money) {
                System.out.println(name + "withdraw" + money + "yuan;");
                this.balance -= money;
                System.out.println(name + "'s balance is" + balance);
            } else {
                System.out.println(name + "'s balance is not enough!");
            }
        } finally {
            lock.unlock();
        }

    }
}
