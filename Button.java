package Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button implements ActionListener {
    private ArithmeticOperation operation;
    private ArithmeticCalculator calculator;

    public Button(ArithmeticOperation operation, ArithmeticCalculator calculator) {
        this.operation = operation;
        this.calculator = calculator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(calculator.getTextField1().getText());
            int num2 = Integer.parseInt(calculator.getTextField2().getText());
            ArithmeticStrategy strategy = ArithmeticFactory.getOperation(operation);
            int result = strategy.calculate(num1, num2);
            calculator.getResultField().setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(calculator, "Invalid input. Please enter valid integers.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(calculator, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
