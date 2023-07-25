package W11_june10_tusk4;

/*
Створіть проект за допомогою IntelliJ IDEA. Створіть клас Calculator. У тілі класу створіть чотири методи для
арифметичних дій: (add – додавання, sub – віднімання, mul – множення, div – поділ). Метод поділу повинен перевірити
поділ на нуль, якщо перевірка не проходить, згенерувати виняток. Користувач вводить значення, над якими хоче зробити
операцію та вибрати саму операцію. У разі виникнення помилок повинні викидатися винятки.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        double a = scanner.nextDouble();
        System.out.println("Enter 2nd number: ");
        double b = scanner.nextDouble();

        System.out.println("Enter operation what you want to do (+, -, *, /): ");
        String operation = scanner.next();
        scanner.nextLine();

        Calculator calculator = new Calculator(a, b);

        switch (operation) {
            case "+":
                System.out.println("Result: " + calculator.add());
                break;
            case "-":
                System.out.println("Result: " + calculator.sub());
                break;
            case "*":
                System.out.println("Result: " + calculator.mul());
                break;
            case "/":
                try {
                    System.out.println("Result: " + calculator.div());
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            default:
                System.out.println("You entered an invalid operation.");
        }
    }
}
