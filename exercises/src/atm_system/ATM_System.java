package atm_system;

import java.util.*;

import static java.lang.Thread.sleep;

/**
 * function: Create an ATM startup class
 *
 * Author: ShenJiaFa
 * Since: 2022/3/13-16:05
 */
public class ATM_System {
    public static void main(String[] args) throws InterruptedException {
        //First create a container to facilitate the operation of the model class
        ArrayList<Account> accounts=new ArrayList<>();
        //Build home page
        Scanner sc=new Scanner(System.in);
            System.out.println("=========ATM=========");
            System.out.println("1.Sign In");
            System.out.println("2.Register");
            System.out.println("---------------------");
            System.out.println("Please select opt:");
        while (true) {
            int cmd=sc.nextInt();
            switch (cmd){
                case 1:
                    signIn(accounts,sc);
                    break;
                case 2:
                    register(accounts,sc);
                    break;
                default:
                    System.out.println("Please re-enter!");
            }
        }

    }

    /**
     * User login method
     * @param accounts Account information
     * @param sc scanner
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

            if (getIndexofAccount(input, accounts)!=null) {
                while (true) {
                    System.out.println("Please enter the corresponding password:");
                    String pwd = sc.next();
                    if (pwd.equals(accounts.get(getIndexofAccount(input, accounts)).getPassword())) {
                        System.out.println("登录成功!您的卡号是" + input);
                        break;
                    } else {
                        System.out.println("Password error,retry!");
                    }
                }
            } else {
                System.out.println("There is no information about this user in the system, please re-enter");
            }
        }
    }

    /**
     * User registration function
     * @param accounts Account information
     * @param sc scanner
     */
    private static void register(List<Account> accounts,Scanner sc) throws InterruptedException {
        System.out.println("===========Register===========");
        Account account=new Account();
        System.out.println("Please enter your user name:");
        account.setUserName(sc.next());

        System.out.println("Please enter your password:");
        while (true) {
            String pwd=sc.next();
            System.out.println("Please re-enter your password:");
            String re_Pwd=sc.next();
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
        String cardId=getRandomCardId(accounts);
        account.setCardId(cardId);
        accounts.add(account);
        System.out.println("register success! Your card ID is "+cardId);
    }

    /**
     * Method to generate ID
     * @return
     */
    private static String getRandomCardId(List<Account> accounts) {
        String id="";
        Random rd=new Random();

        Integer index=getIndexofAccount(id,accounts);

        do{
            for (int i=0; i<8;i++){
                id+=rd.nextInt(10);
            }

        }while(getIndexofAccount(id, accounts)!=null);
        return id;
    }

    private static Integer getIndexofAccount(String id, List<Account> accounts) {
        for(int i=0;i<accounts.size();i++){
            if(accounts.get(i).getCardId().equals(id)){
                return i;
            }
        }
        return null;
    }


}
