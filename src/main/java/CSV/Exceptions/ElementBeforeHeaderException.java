package CSV.Exceptions;

public class ElementBeforeHeaderException extends RuntimeException {
    public ElementBeforeHeaderException(String message) {
        super(message);
    }
}
