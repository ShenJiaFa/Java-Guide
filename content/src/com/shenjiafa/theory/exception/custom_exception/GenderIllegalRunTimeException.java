package com.shenjiafa.theory.exception.custom_exception;

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
