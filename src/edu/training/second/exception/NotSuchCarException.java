package edu.training.second.exception;

/**
 * Created by Roman on 02.10.2016.
 */
public class NotSuchCarException extends Exception {
    public NotSuchCarException() {
    }

    public NotSuchCarException(String message) {
        super(message);
    }

    public NotSuchCarException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotSuchCarException(Throwable cause) {
        super(cause);
    }

    public NotSuchCarException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
