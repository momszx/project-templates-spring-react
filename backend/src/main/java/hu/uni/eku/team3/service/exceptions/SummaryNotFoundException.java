package hu.uni.eku.team3.service.exceptions;

public class SummaryNotFoundException extends Exception{
    public SummaryNotFoundException() {
    }

    public SummaryNotFoundException(String message) {
        super(message);
    }

    public SummaryNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public SummaryNotFoundException(Throwable cause) {
        super(cause);
    }

    public SummaryNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
