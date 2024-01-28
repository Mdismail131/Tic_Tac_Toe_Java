package exceptions;

public class CellAlreadyOccupiedException extends Exception {
    public CellAlreadyOccupiedException(String message) {
        super(message);
    }

    public CellAlreadyOccupiedException() {
        super("Cell chosen by the user was already Occupied.");
    }
}
