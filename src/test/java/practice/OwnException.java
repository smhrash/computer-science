package practice;

public class OwnException extends RuntimeException {
    public OwnException(String errorMessage) {

        super("Thrown from custom exception class: " + errorMessage);
    }
}


