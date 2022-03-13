package atm_system;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

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
        while (true){
            System.out.println("\033[1;92m"+"=========ATM=========");
            System.out.println("1.Sign In");
            System.out.println("2.Register");
            System.out.println("\033[1;92m"+"---------------------");
            System.out.println("Please select opt:");
            int cmd=sc.nextInt();
            switch (cmd){
                case 1:
                    //登录操作
                    break;
                case 2:
                    register(accounts,sc);
                    break;
                default:
                    System.out.println("Please re-enter!");
                    sleep(1188);
            }
        }
    }

    /**
     * User registration function
     * @param accounts Account information
     */
    private static void register(List<Account> accounts,Scanner sc) throws InterruptedException {
        System.out.println("\033[1;92m"+"===========Register===========");
        Account account=new Account();

        System.out.println("Please enter your user name:");
        account.setUserName(sc.next());

        while (true) {
            System.out.println("Please enter your password:");
            String pwd=sc.next();
            System.out.println("Please re-enter your password:");
            String re_Pwd=sc.next();

            if (pwd.equals(re_Pwd)) {
                account.setPassword(pwd);
                break;
            } else {
                System.out.println("Please retry password ");
                sleep(1188);
            }
        }
        System.out.println("Please re-enter your quota:");
        account.setQuota(sc.nextDouble());
        //Create a method to generate ID
        String cardId=getRandomCardId(accounts);



    }

    /**
     * Method to generate ID
     * @return
     */
    private static String getRandomCardId(List<Account> accounts) {
        String id="";
        Random rd=new Random();
        do{
            for (int i=0; i<8;i++){
                id+=rd.nextInt(10);
            }

        }while(accounts.contains(rd));
        return id;
    }


}
