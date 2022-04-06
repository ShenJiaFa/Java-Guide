package java_all.java_se.practice.complex_practice.atm_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Function: Create an ATM startup class
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class ATMSystem {
    public static void main(String[] args) throws InterruptedException {
        //First create a container to facilitate the operation of the model class
        ArrayList<Account> accounts = new ArrayList<>();
        while (true) {
            //Build home page
            Scanner sc = new Scanner(System.in);
            System.out.println("=========ATM=========");
            System.out.println("1.Sign In");
            System.out.println("2.Register");
            System.out.println("---------------------");
            System.out.println("Please select opt:");

            int cmd = sc.nextInt();
            switch (cmd) {
                case 1:
                    signIn(accounts, sc);
                    break;
                case 2:
                    register(accounts, sc);
                    break;
                default:
                    System.out.println("Please re-enter!");
            }
        }
    }

    /**
     * User login method
     *
     * @param accounts Account information
     * @param sc       scanner
     */
    private static void signIn(ArrayList<Account> accounts, Scanner sc) throws InterruptedException {
        System.out.println("===========Sign In===========");
        //If the system does not have an account, the login must fail
        if (accounts.size() == 0) {
            System.out.println("There is no user data in the system at present, please operate after register an account!");
            return;
        }
        while (true) {
            System.out.println("Please enter your card id:");
            String input = sc.next();
            Integer index = getIndexofAccount(input, accounts);
            if (index != null) {
                while (true) {
                    System.out.println("Please enter the corresponding password:");
                    String pwd = sc.next();
                    if (pwd.equals(accounts.get(getIndexofAccount(input, accounts)).getPassword())) {
                        System.out.println("Login succeeded! Your card id is: " + input);
                        userOption(accounts.get(index), accounts, sc);
                        return;
                    } else {
                        System.out.println("Password error,retry!");
                    }
                }
            } else {
                System.out.println("There is no information about this user in the system, please re-enter...");
            }
        }
    }

    private static void userOption(Account account, List<Account> accounts, Scanner sc) {
        while (true) {
            System.out.println("===========Options===========");
            System.out.println("1.Query account info");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Transfer");
            System.out.println("5.Change Password");
            System.out.println("6.sign out");
            System.out.println("7.Account cancellation");
            System.out.println("Please enter your option:");
            int cmd = sc.nextInt();
            switch (cmd) {
                case 1:
                    //Show user's account
                    showAccount(account);
                    break;
                case 2:
                    //User deposit
                    deposit(account, sc);
                    break;
                case 3:
                    //User withdraw
                    withdraw(account, sc);
                    break;
                case 4:
                    //User transfer
                    transfer(account, accounts, sc);
                    break;
                case 5:
                    //User update password
                    updatePassword(account, sc);
                    return;
                case 6:
                    //User sign out
                    signOut();
                    return;
                case 7:
                    //User account cancellation
                    if (cancelAccount(account, accounts, sc)) {
                        return;
                    } else {
                        break;
                    }
                default:
                    System.out.println("Nonexistent operation! Please re-enter:");
            }
        }
    }

    /**
     * User sign out
     */
    private static void signOut() {
        System.out.println("Thanks for using, see you next time!");
    }

    /**
     * Account cancellation
     *
     * @param account  User Account
     * @param accounts Accounts info
     * @param sc       Scanner
     */
    private static boolean cancelAccount(Account account, List<Account> accounts, Scanner sc) {
        System.out.println("===========Cancel Account===========");
        System.out.println("Are you sure you want to cancel your account? Enter letter Y to confirm:");
        String cmd = sc.next();
        switch (cmd) {
            case "y":
            case "Y":
                if (account.getBalance() > 0) {
                    System.out.println("Your account still has balance and cannot be cancelled!");
                    break;
                } else {
                    int userIndex = getIndexofAccount(account.getCardId(), accounts);
                    accounts.remove(userIndex);
                    System.out.println("Account cancellation completed!");
                    return true;
                }
            default:
                System.out.println("Cancellation of account cancellation!");
                break;
        }
        return false;
    }

    /**
     * Update password method
     *
     * @param account User account
     * @param sc      Scanner
     */
    private static void updatePassword(Account account, Scanner sc) {
        System.out.println("===========Update PWD===========");
        System.out.println("Please enter your password:");
        while (true) {
            String oldPasswordInput = sc.next();
            if (oldPasswordInput.equals(account.getPassword())) {
                while (true) {
                    System.out.println("Please enter your new password:");
                    String newPassword = sc.next();
                    System.out.println("Please re-enter your new password again:");
                    String newPasswordAgain = sc.next();
                    if (newPassword.equals(newPasswordAgain)) {
                        account.setPassword(newPassword);
                        System.out.println("Update Success!");
                        return;
                    } else {
                        System.out.println("Inequality!Restart set password...");
                    }
                }
            } else {
                System.out.println("Wrong password! Please re-renter:");
            }
        }
    }

    /**
     * Transfer money method
     *
     * @param account  User account
     * @param accounts Accounts info
     * @param sc       Scanner
     */
    private static void transfer(Account account, List<Account> accounts, Scanner sc) {

        //guard clause
        if (accounts.size() < 2 || account.getBalance() == 0) {
            System.out.println("Insufficient number or balance of your accounts, unable to transfer!");
            return;
        }
        while (true) {
            //Start transfer operation
            System.out.println("Please enter the payee card id:");
            String payeeCardId = sc.next();
            //Judge the input
            if (payeeCardId == account.getCardId()) {
                System.out.println("Input error,please enter the payee card id,not yours!");
                continue;
            } else {
                Integer index = getIndexofAccount(payeeCardId, accounts);
                if (null == index) {
                    System.out.println("Payee account does not exist, please re-enter:");
                    continue;
                } else {
                    while (true) {
                        System.out.println("Please enter the payee's last name:");
                        String lastName = sc.next();
                        if (lastName.equals(accounts.get(index).getUserName().charAt(0) + "")) {
                            System.out.println("Verification passed!");
                            while (true) {
                                System.out.println("Please enter the transfer amount:");
                                double money = sc.nextDouble();
                                if (money <= 0) {
                                    System.out.println("Amount input error, please re-enter...");
                                    continue;
                                } else {
                                    if (money > account.getBalance()) {
                                        System.out.println("Insufficient Balance!");
                                        continue;
                                    }
                                    account.setBalance(account.getBalance() - money);
                                    Account payeeAccount = accounts.get(index);
                                    payeeAccount.setBalance(payeeAccount.getBalance() + money);
                                    System.out.println("Transfer succeeded!");
                                    showAccount(account);
                                    return;
                                }
                            }
                        } else {
                            System.out.println("Authentication failed!");
                        }
                    }
                }
            }
        }
    }

    /**
     * User withdraw money method
     *
     * @param account user account
     * @param sc      Scanner
     */
    private static void withdraw(Account account, Scanner sc) {
        while (true) {
            //guard clause
            if (account.getBalance() < 100) {
                System.out.println("Your balance is too small. Please deposit it first!");
                return;
            }
            System.out.println("===========Deposit===========");
            System.out.println("Please enter your withdraw amount:");
            double amount = sc.nextDouble();
            if (amount > account.getQuota()) {
                System.out.println("Exceed quota! Please retry...");
            } else {
                if (account.getBalance() - amount >= 0) {
                    account.setBalance(account.getBalance() - amount);
                    System.out.println("Withdraw success!");
                    showAccount(account);
                    break;
                } else {
                    System.out.println("Sorry! Your balance is not enough,please re-enter your amount");
                }
            }
        }
    }

    /**
     * Deposit method
     *
     * @param account User account
     * @param sc      Scanner
     */
    private static void deposit(Account account, Scanner sc) {
        System.out.println("===========Deposit===========");
        System.out.println("Please enter your deposit amount:");
        double amount = sc.nextDouble();
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposit success! Your current balance is:");
        showAccount(account);
    }

    /**
     * Show current user information
     *
     * @param account user account
     */
    private static void showAccount(Account account) {
        System.out.println("===========User Info===========");
        System.out.println("Card Id:" + account.getCardId());
        System.out.println("User Name:" + account.getUserName());
        System.out.println("Balance:" + account.getBalance());
        System.out.println("Quota:" + account.getQuota());
    }

    /**
     * User registration function
     *
     * @param accounts Accounts information
     * @param sc       scanner
     */
    private static void register(List<Account> accounts, Scanner sc) throws InterruptedException {
        System.out.println("===========Register===========");
        Account account = new Account();
        System.out.println("Please enter your user name:");
        account.setUserName(sc.next());

        System.out.println("Please enter your password:");
        while (true) {
            String pwd = sc.next();
            System.out.println("Please re-enter your password:");
            String re_Pwd = sc.next();
            if (pwd.equals(re_Pwd)) {
                account.setPassword(pwd);
                break;
            } else {
                System.out.println("Inequality!Restart set password...");
            }
        }
        System.out.println("Please enter your quota:");
        account.setQuota(sc.nextDouble());
        //Create a method to generate ID
        String cardId = getRandomCardId(accounts);
        account.setCardId(cardId);
        accounts.add(account);
        System.out.println("register success! Your card ID is: " + cardId);
    }

    /**
     * Generate ID method
     *
     * @param accounts
     * @return User card id
     */
    private static String getRandomCardId(List<Account> accounts) {
        String id = "";
        Random rd = new Random();

        Integer index = getIndexofAccount(id, accounts);

        do {
            for (int i = 0; i < 8; i++) {
                id += rd.nextInt(10);
            }

        } while (getIndexofAccount(id, accounts) != null);
        return id;
    }

    /**
     * Get the corresponding index of account by card id
     *
     * @param id       User card id
     * @param accounts User account
     * @return The index of corresponding account
     */
    private static Integer getIndexofAccount(String id, List<Account> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getCardId().equals(id)) {
                return i;
            }
        }
        return null;
    }
}
