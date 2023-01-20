package src.errors;

// built in exceptions - https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html
public class InvalidPlayerCountException extends Exception {
    public InvalidPlayerCountException(final int count) {
        super("Player count is required to be between 1 and 4, currently " + count);
    }

    public InvalidPlayerCountException(final int count, final Throwable cause) {
        super("Player count is required to be between 1 and 4, currently " + count, cause);
    }
}