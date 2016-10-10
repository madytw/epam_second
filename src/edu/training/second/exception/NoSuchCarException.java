package edu.training.second.exception;

/**
 * Created by Roman on 02.10.2016.
 */
public class NoSuchCarException extends Exception {
    public NoSuchCarException() {
    }

    public NoSuchCarException(String message) {
        super(message);
    }

    public NoSuchCarException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchCarException(Throwable cause) {
        super(cause);
    }

    public NoSuchCarException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
