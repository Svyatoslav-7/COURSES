package W11_june10_tusk2;

/*
Створіть проект за допомогою IntelliJ IDEA. Потрібно: Описати клас з ім'ям Worker, що містить такі поля:

  прізвище та ініціали працівника;
  назва посади;
  рік надходження на роботу.

Написати програму, яка виконує такі дії:

  введення з клавіатури даних до масиву, що складається з п'яти елементів типу Worker (записи мають бути впорядковані за абеткою);
  якщо значення року введено не у відповідному форматі, видає виняток.
  виведення на екран прізвища працівника, стаж роботи якого перевищує введене значення.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Worker> workers = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            System.out.println("Enter your second name: ");
            String secondName = scanner.nextLine();

            System.out.println("Enter name of your work: ");
            String nameOfWork = scanner.nextLine();

            try {
                System.out.println("Enter when you started work (year): ");
                int startYear = scanner.nextInt();
                if (startYear < 1900 || startYear > 2023) {
                    throw new InvalidYearFormatException("Invalid year format. Please enter a valid year.");
                }
                Worker worker = new Worker(name, secondName, nameOfWork, startYear);
                workers.add(worker);
                scanner.nextLine();
            } catch (InvalidYearFormatException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            }
        }

        System.out.println("Enter how much you work: ");
        int requiredExperience = scanner.nextInt();

        for (Worker worker : workers) {
            if (worker.getExperience() > requiredExperience) {
                System.out.println("Man who work more: "+worker.getLastName());
            }
        }
    }
}
