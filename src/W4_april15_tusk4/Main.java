package W4_april15_tusk4;

//Є N клієнтів, яким компанія-виробник має доставити товар. Скільки є можливих маршрутів доставлення товару з
//урахуванням того, що товар доставлятиме одна машина? Використовуючи IntelliJ IDEA, створіть клас Delivery.
//Напишіть програму, яка розраховуватиме та виводитиме на екран кількість можливих варіантів доставлення товару.
//Для розв’язку задачі використовуйте факторіал N!, що розраховується за допомогою циклу do-while.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість клієнтів: ");
        int n = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Кількість можливих маршрутів доставки: " + factorial);
    }
}
