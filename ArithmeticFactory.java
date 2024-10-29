package Calculator;

public class ArithmeticFactory {
    public static ArithmeticStrategy getOperation(ArithmeticOperation operation) {
        switch (operation) {
            case ADDITION:
                return new Addition();
            case SUBTRACTION:
                return new Subtraction();
            case MULTIPLICATION:
                return new Multiplication();
            case DIVISION:
                return new Division();
            default:
                throw new IllegalArgumentException("Unknown operation");
        }
    }
}
