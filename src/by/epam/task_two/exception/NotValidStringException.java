package by.epam.task_two.exception;

public class NotValidStringException extends Exception {
    public NotValidStringException() {
    }

    public NotValidStringException(String message) {
        super(message);
    }

    public NotValidStringException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotValidStringException(Throwable cause) {
        super(cause);
    }
}
