package lesson8_hw;

public class WrongPasswordException extends Exception{
    public WrongPasswordException() {
    }
    public WrongPasswordException(String message) {
        super(message);
    }
}
