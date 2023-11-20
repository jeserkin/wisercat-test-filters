package eu.wisercat.test.exception;

public class InvalidEnumException extends RuntimeException {
    public InvalidEnumException(String message) {
        super(message);
    }
}
