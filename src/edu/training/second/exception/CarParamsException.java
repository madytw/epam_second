package edu.training.second.exception;

/**
 * Created by Roman on 09.10.2016.
 */
public class CarParamsException extends Exception {
    public CarParamsException() {
    }

    public CarParamsException(String message) {
        super(message);
    }

    public CarParamsException(String message, Throwable cause) {
        super(message, cause);
    }

    public CarParamsException(Throwable cause) {
        super(cause);
    }

    public CarParamsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
