package Calculator;

public class Multiplication implements ArithmeticStrategy {
    @Override
    public int calculate(int num1, int num2) {
        return num1 * num2;
    }
}
