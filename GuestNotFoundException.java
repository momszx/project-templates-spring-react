package hu.uni.eku.team3.service.exceptions;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

public class GuestNotFoundException extends Exception{
    public GuestNotFoundException() {
    }

    public GuestNotFoundException(String message) {
        super(message);
    }

    public GuestNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public GuestNotFoundException(Throwable cause) {
        super(cause);
    }

    public GuestNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}