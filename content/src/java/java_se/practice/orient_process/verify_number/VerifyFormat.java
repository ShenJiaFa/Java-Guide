package java.java_se.practice.orient_process.verify_number;

/**
 * Function: Format validation using regular expressions
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class VerifyFormat {
    public static void main(String[] args) {

        // Phone number
        String phone = "15722926571";

        // email address
        String email = "sjfdzh@gmail.com";

        // telephone number
        String tel = "025-888888";

        // QQ number
        String qq = "100001";

        // print verify result
        System.out.println("The result of verifying the phone number is"+verifyPhone(phone));
        System.out.println("The result of verifying the email address is"+verifyEmail(email));
        System.out.println("The result of verifying the telephone number is"+verifyTel(tel));
        System.out.println("The result of verifying the QQ number is"+verifyQQ(qq));
    }

    /**
     * Verify telephone number
     *
     * @param tel Telephone number
     * @return Verify result
     */
    private static boolean verifyTel(String tel) {
        return tel.matches("0\\d{2,6}-?\\d{5,20}");
    }

    /**
     * Verify email address
     *
     * @param email Email address
     * @return Verify result
     */
    private static boolean verifyEmail(String email) {

        return email.matches("\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}");

    }

    /**
     * Verify phone number
     *
     * @param phone Phone number
     * @return Verify result
     */
    private static boolean verifyPhone(String phone) {

        return phone.matches("1[3-9]\\d{9}");
    }

    /**
     * Verify qq number
     *
     * @param qq QQ number
     * @return Verify result
     */
    private static boolean verifyQQ(String qq) {
        return qq.matches("[1-9]\\d{5,19}");
    }
}
