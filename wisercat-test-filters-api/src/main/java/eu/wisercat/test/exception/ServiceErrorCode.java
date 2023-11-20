package eu.wisercat.test.exception;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
public enum ServiceErrorCode {

    FILTER_NOT_FOUND(HttpStatus.NOT_FOUND);

    private final HttpStatus httpStatus;

    public int getHttpStatusCode() {
        return httpStatus.value();
    }
}
