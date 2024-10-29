package Calculator;

import javax.swing.*;
import java.awt.*;

public class ArithmeticCalculator extends JFrame {
    private JTextField textField1, textField2, resultField;

    public ArithmeticCalculator() {
        setTitle("Arithmetic Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel label1 = new JLabel("Number 1:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(label1, gbc);

        textField1 = new JTextField();
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(textField1, gbc);

        JLabel label2 = new JLabel("Number 2:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(label2, gbc);

        textField2 = new JTextField();
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(textField2, gbc);

        JLabel label3 = new JLabel("Result:");
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(label3, gbc);

        resultField = new JTextField();
        resultField.setEditable(false);
        gbc.gridx = 0;
        gbc.gridy = 5;
        add(resultField, gbc);

        JButton addButton = new JButton("+");
        addButton.addActionListener(new Button(ArithmeticOperation.ADDITION, this));
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(addButton, gbc);

        JButton subtractButton = new JButton("-");
        subtractButton.addActionListener(new Button(ArithmeticOperation.SUBTRACTION, this));
        gbc.gridx = 2;
        gbc.gridy = 1;
        add(subtractButton, gbc);

        JButton multiplyButton = new JButton("*");
        multiplyButton.addActionListener(new Button(ArithmeticOperation.MULTIPLICATION, this));
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(multiplyButton, gbc);

        JButton divideButton = new JButton("/");
        divideButton.addActionListener(new Button(ArithmeticOperation.DIVISION, this));
        gbc.gridx = 2;
        gbc.gridy = 3;
        add(divideButton, gbc);

        setVisible(true);
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public JTextField getResultField() {
        return resultField;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ArithmeticCalculator::new);
    }
}
