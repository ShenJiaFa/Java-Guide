package java_all.java_se.theory.exception.custom_exception;

/**
 * Function: Age illegal exception
 *
 * @author: ShenJiaFa
 * @since: 2022/4/7
 */
public class AgeIllegalException extends Exception {

    public AgeIllegalException(String message) {
        super(message);
    }

    public AgeIllegalException() {
    }

}
