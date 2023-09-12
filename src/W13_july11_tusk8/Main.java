package W13_july11_tusk8;

/*
Напишіть жартівливу програму «Дешифратор», яка в текстовому файлі могла б замінити всі прийменники на слово «Java».
* Завдання із зірочкою - перезаписати вміст файлу
*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Svyatoslav\\Desktop\\itea\\java\\COURSES\\src\\W13_july11_tusk8\\com.example.txt");

        try {
            String content = "";

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                content += line + "\n";
            }
            scanner.close();

            System.out.println("Незмінений вміст файлу:");
            System.out.println(content);

            String replacedContent = content.replaceAll("\\b[ПпOoAa] \\b", "Java ");

            FileWriter writer = new FileWriter(file);
            writer.write(replacedContent);
            writer.close();

            System.out.println("Заміна прийменників успішно виконана!");

            System.out.println("Змінений вміст файлу:");
            System.out.println(replacedContent);

        } catch (IOException e) {
            System.out.println("Помилка при роботі з файлом:");
            e.printStackTrace();
        }
    }
}
