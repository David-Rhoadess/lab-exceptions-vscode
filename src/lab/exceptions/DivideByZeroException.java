package lab.exceptions;

public class DivideByZeroException extends Exception {
    public DivideByZeroException() {
        super();
    }

    public DivideByZeroException(String reason) {
        super(reason);
    } // YourException(String)

}
