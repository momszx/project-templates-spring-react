package hu.uni.eku.team3.service.exceptions;

public class SummaryAlreadyExistsException extends Exception{
    public SummaryAlreadyExistsException() {
    }

    public SummaryAlreadyExistsException(String message) {
        super(message);
    }

    public SummaryAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public SummaryAlreadyExistsException(Throwable cause) {
        super(cause);
    }

    public SummaryAlreadyExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
