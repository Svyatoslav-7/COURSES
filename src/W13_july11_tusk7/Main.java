package W13_july11_tusk7;

/*
Створіть у пакеті текстовий файл і клас, внесіть у файл якийсь текст.
Виведіть на екран вміст файлу
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Svyatoslav\\Desktop\\itea\\java\\COURSES\\src\\W13_july11_tusk7\\com.example.txt");

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдено.");
            e.printStackTrace();
        }
    }
}

