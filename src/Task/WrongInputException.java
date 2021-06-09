package Task;

public class WrongInputException extends Exception{
    public WrongInputException() {
    }

    public WrongInputException(String s) {
        super(s);
    }

    public WrongInputException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public WrongInputException(Throwable throwable) {
        super(throwable);
    }

    public WrongInputException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
