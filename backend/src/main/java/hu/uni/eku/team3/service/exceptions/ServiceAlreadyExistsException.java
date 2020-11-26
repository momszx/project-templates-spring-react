package hu.uni.eku.team3.service.exceptions;

public class ServiceAlreadyExistsException extends Exception {

    public ServiceAlreadyExistsException() {
    }

    public ServiceAlreadyExistsException(String message) {
        super(message);
    }

    public ServiceAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceAlreadyExistsException(Throwable cause) {
        super(cause);
    }

    public ServiceAlreadyExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
