package java.java_se.practice.orient_process.verification_code;

import java.util.Random;

/**
 * Function: Generate verification code
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class VerificationCode {
    public static void main(String[] args) {
        System.out.println(getCode(100));
    }

    /**
     * Generate verification code
     *
     * @param length The length of the verification code
     * @return verification code
     */
    public static String getCode(int length) {
        Random rd = new Random();
        //声明一个字符对象
        char c = ' ';
        //声明一个字符数组用于存储验证码
        char[] cs = new char[length];
        //声明一个字符串用于存储验证码
        String code;
        for (int i = 0; i < length; i++) {
            int type = rd.nextInt(3);
            switch (type) {
                case 0:
                    c = (char) (rd.nextInt(10) + 48);
                    break;
                case 1:
                    c = (char) (rd.nextInt(26) + 65);
                    break;
                case 2:
                    c = (char) (rd.nextInt(26) + 97);
                    break;
            }
            cs[i] = c;
        }
        code = String.valueOf(cs);
        return code;
    }
}
