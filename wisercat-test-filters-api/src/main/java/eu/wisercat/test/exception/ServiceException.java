package eu.wisercat.test.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

public class ServiceException extends RuntimeException {

    @Getter
    private final ServiceErrorCode errorCode;
    private HttpStatus overriddenHttpStatus;

    public ServiceException(ServiceErrorCode errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public ServiceException(ServiceErrorCode errorCode, String message, Exception e) {
        super(message, e);
        this.errorCode = errorCode;
    }

    public ServiceException(ServiceErrorCode errorCode, String message, HttpStatus overriddenHttpStatus) {
        super(message);
        this.errorCode = errorCode;
        this.overriddenHttpStatus = overriddenHttpStatus;
    }

    public ServiceException(ServiceErrorCode errorCode, String message, HttpStatus overriddenHttpStatus, Exception e) {
        super(message, e);
        this.errorCode = errorCode;
        this.overriddenHttpStatus = overriddenHttpStatus;
    }

    public int getHttpStatusCode() {
        return overriddenHttpStatus == null ? errorCode.getHttpStatusCode() : overriddenHttpStatus.value();
    }
}
