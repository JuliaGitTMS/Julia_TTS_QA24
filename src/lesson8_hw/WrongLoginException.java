package lesson8_hw;

public class WrongLoginException extends Exception{
    public WrongLoginException() {
    }
    public WrongLoginException(String message) {
        super(message);
    }
}
