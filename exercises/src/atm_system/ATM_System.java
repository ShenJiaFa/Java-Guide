package atm_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * function: Create an ATM startup class
 * <p>
 * Author: ShenJiaFa
 * Since: 2022/3/13-16:05
 */
public class ATM_System {
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
            System.out.println("There is no user data in the system at present, please operate after register an account");
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
                        System.out.println("Login succeeded! Your card id is" + input);
                        userOption(accounts.get(index), sc);
                        return;
                    } else {
                        System.out.println("Password error,retry!");
                    }
                }
            } else {
                System.out.println("There is no information about this user in the system, please re-enter");
            }
        }
    }

    private static void userOption(Account account, Scanner sc) {

        while (true) {
            System.out.println("===========Options===========");
            System.out.println("1.Query account info");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Transfer");
            System.out.println("5.Change Password");
            System.out.println("6.sign out");
            System.out.println("7.Account cancellation");
            System.out.println("Please enter your options:");
            int cmd = sc.nextInt();
            switch (cmd) {
                case 1:
                    //Show current User information
                    showAccount(account);
                    break;
                case 2:
                    //Deposit method
                    deposit(account, sc);
                    break;
                case 3:
                    withdraw(account, sc);
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Thanks for using, see you next time!");
                    return;
                case 7:
                    break;
                default:
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
                System.out.println("Your balance is too small. Please deposit it first");
                return;
            }
            System.out.println("===========Deposit===========");
            System.out.println("Please enter your withdraw amount:");
            double amount = sc.nextDouble();
            if (amount > account.getQuota()) {
                System.out.println("Exceed quota! Please retry");
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
        System.out.println("Please enter your deposit amount");
        double amount = sc.nextDouble();
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposit success! Your current balance is ");
        showAccount(account);
    }

    /**
     * Show current user information
     *
     * @param account current user account
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
     * @param accounts Account information
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
                System.out.println("Inequality!Restart set password");
            }
        }
        System.out.println("Please enter your quota:");
        account.setQuota(sc.nextDouble());
        //Create a method to generate ID
        String cardId = getRandomCardId(accounts);
        account.setCardId(cardId);
        accounts.add(account);
        System.out.println("register success! Your card ID is " + cardId);
    }

    /**
     * Generate ID method
     *
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
     * @param id
     * @param accounts
     * @return
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
