package Calculator;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(ArithmeticCalculator::new);
    }
}
