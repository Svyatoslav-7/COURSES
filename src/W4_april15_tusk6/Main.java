package W4_april15_tusk6;

//Дано ціле число N (> 0). Використовуючи один цикл, знайдіть суму 1 + 1/(1!) + 1/(2!) + 1/(3!) +. . . + 1/(N!)

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число (>0): ");
        int n = scanner.nextInt();
        double sum = 0;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            sum += 1.0 / factorial;
        }
        System.out.println(sum);
    }
}
