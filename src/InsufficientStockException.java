public class InsufficientStockException extends RuntimeException {
    // Constructor that passes a custom error message up to the parent Exception class
    public InsufficientStockException(String message) {
        super(message);
    }
}