package hu.uni.eku.team3.service.exceptions;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

public class PositionAlreadyExistsException extends Exception{
    public PositionAlreadyExistsException() {
    }

    public PositionAlreadyExistsException(String message) {
        super(message);
    }

    public PositionAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public PositionAlreadyExistsException(Throwable cause) {
        super(cause);
    }

    public PositionAlreadyExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
