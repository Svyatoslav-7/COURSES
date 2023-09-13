package W14_july22_tusk8;

import java.util.function.BinaryOperator;

public class Calculator {
    public static void main(String[] args) {
        BinaryOperator<Double> addition = (a, b) -> a + b;
        BinaryOperator<Double> subtraction = (a, b) -> a - b;
        BinaryOperator<Double> multiplication = (a, b) -> a * b;
        BinaryOperator<Double> division = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Ділення на нуль неможливе");
            }
            return a / b;
        };

        double operand1 = 10.0;
        double operand2 = 5.0;

        double sum = addition.apply(operand1, operand2);
        System.out.println("Додавання: " + sum);

        double difference = subtraction.apply(operand1, operand2);
        System.out.println("Віднімання: " + difference);

        double product = multiplication.apply(operand1, operand2);
        System.out.println("Множення: " + product);

        try {
            double quotient = division.apply(operand1, operand2);
            System.out.println("Ділення: " + quotient);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }
}

