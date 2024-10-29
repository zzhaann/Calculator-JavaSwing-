package Calculator;

public class Division implements ArithmeticStrategy {
    @Override
    public int calculate(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return num1 / num2;
    }
}
