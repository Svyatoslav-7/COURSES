package W6_may1_tusk15;

// Є N клієнтів, яким компанія-виробник має доставити товар. Скільки є можливих маршрутів доставлення товару з
// урахуванням того, що товар доставлятиме одна машина? Використовуючи IntelliJ IDEA, створіть клас Delivery.
// Напишіть програму, яка розраховуватиме та виводитиме на екран кількість можливих варіантів доставлення товару.
// Для розв'язку задачі, використовуйте факторіал N!, що розраховується рекурсією. Поясніть, чому не рекомендується
// використовувати рекурсію для розрахунку факторіала. Вкажіть слабкі місця цього підходу.

import java.util.Scanner;

public class Main {
    public static int calculate(int a) {
        if (a == 0) {
            return 1;
        } else {
            return a * calculate(a-1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of clients: ");
        int a = scanner.nextInt();
        int routes = calculate(a);
        System.out.println("The number of possible routes is: " + routes);
    }

}

//ліпше уникати використання рекурсії в цій задачі, так як можна використати просто factorial і все,
// а в рекурсії легко запутатись і зробити помилку
