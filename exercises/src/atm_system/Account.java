package atm_system;

/**
 * function: Create an account class to hold user information
 *
 * Author: ShenJiaFa
 * Since: 2022/3/13-15:55
 */
public class Account {
    /**
     * Card ID
     */
    private String cardId;
    /**
     * User name
     */
    private String userName;

    /**
     * User password
     */
    private String Password;
    /**
     * Account balance
     */
    private double balance;
    /**
     * Single maximum limit
     */
    private double quota;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getQuota() {
        return quota;
    }

    public void setQuota(double quota) {
        this.quota = quota;
    }
}