package ru.itservice.testTask.common.exception;

public class ValueToMapException extends RuntimeException {

    public static final String baseMessage = "cannot.convert.value";

    public ValueToMapException() {
        super(baseMessage);
    }

    public ValueToMapException(String message) {
        super(message);
    }

    public ValueToMapException(String message, Throwable cause) {
        super(message, cause);
    }
}
