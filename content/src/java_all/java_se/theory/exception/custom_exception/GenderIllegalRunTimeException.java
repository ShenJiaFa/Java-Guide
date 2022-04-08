package java_all.java_se.theory.exception.custom_exception;

/**
 * Function: Age illegal exception
 *
 * @author: ShenJiaFa
 * @since: 2022/4/7
 */
public class GenderIllegalRunTimeException extends RuntimeException {

    public GenderIllegalRunTimeException(String message) {
        super(message);
    }

    public GenderIllegalRunTimeException() {
    }

}
