package verify_format;

/**
 * Function: Format validation using regular expressions
 * <p>
 * Author: ShenJiaFa
 * Since: 2022/3/28-22:32
 */
public class VerifyFormat {
    public static void main(String[] args) {

        String phone = "15722926571";
        String email = "sjfdzh@gmail.com";
        String tel = "025-888888";

        System.out.println(verifyPhone(phone));
        System.out.println(verifyEmail(email));
        System.out.println(verifyTel(tel));
    }

    private static boolean verifyTel(String tel) {
        return tel.matches("0\\d{2,6}-?\\d{5,20}");
    }

    private static boolean verifyEmail(String email) {

        return email.matches("\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}");

    }

    private static boolean verifyPhone(String phone) {

        return phone.matches("1[3-9]\\d{9}");
    }
}
