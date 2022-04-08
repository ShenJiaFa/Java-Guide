package java_all.java_se.theory.exception.custom_exception;

import java.util.Objects;

/**
 * Function: Check age
 *
 * @author: ShenJiaFa
 * @since: 2022/4/7
 */
public class RunApp {

    public static void main(String[] args) {

        // Check age
        try {
            checkAge(200);
        } catch (AgeIllegalException e) {
            e.printStackTrace();
        }

        // Check gender
        checkGender("Handsome");

    }

    /**
     * Check age method
     *
     * @param age age
     * @throws AgeIllegalException age illegal exception
     */
    public static void checkAge(int age) throws AgeIllegalException {
        if (age < 0 || age >= 150) {
            throw new AgeIllegalException(age + " is not a legal age");
        } else {
            System.out.println("age check passed");
        }
    }

    /**
     * Check gender method
     *
     * @param gender gender
     */
    public static void checkGender(String gender) {
        if (Objects.equals(gender, "male") || Objects.equals(gender, "female")) {
            System.out.println("gender check passed");
        } else {
            throw new GenderIllegalRunTimeException(gender + " is not a legal gender");
        }
    }

}
