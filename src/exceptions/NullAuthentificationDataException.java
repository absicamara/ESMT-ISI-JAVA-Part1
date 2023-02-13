package exceptions;

public class NullAuthentificationDataException extends Exception{
    public NullAuthentificationDataException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
