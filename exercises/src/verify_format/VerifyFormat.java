package verify_format;

/**
 * Function: Format validation using regular expressions
 *
 * Author: ShenJiaFa
 * Since: 2022/3/28-22:32
 */
public class VerifyFormat {
    public static void main(String[] args) {

        // Phone number
        String phone = "15722926571";

        // email address
        String email = "sjfdzh@gmail.com";

        // telephone number
        String tel = "025-888888";

        System.out.println(verifyPhone(phone));
        System.out.println(verifyEmail(email));
        System.out.println(verifyTel(tel));
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
}
