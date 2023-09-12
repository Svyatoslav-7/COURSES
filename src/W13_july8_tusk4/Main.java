package W13_july8_tusk4;

/*
Вводити з клавіатури рядки, доки користувач не введе рядок 'end':

1. Створити перелік рядків.
2. Ввести рядки з клавіатури та додати їх до списку.
3. Вводити з клавіатури рядки, доки користувач не введе рядок "end". "end" не враховувати.
4. Вивести рядки на екран, кожен з нового рядка.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Введення рядків з клавіатури та додавання їх до списку
        System.out.println("Введіть рядки:");
        while (true) {
            String input = scanner.nextLine();

            // Якщо рядок - "end", завершуємо введення
            if (input.equals("end")) {
                break;
            }

            stringList.add(input);
        }

        // Виведення рядків на екран
        System.out.println("Результат:");
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}
