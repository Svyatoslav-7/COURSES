package W13_july8_tusk5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "data.txt";

        try {
            File file = new File(fileName);
            FileWriter writer = new FileWriter(file);

            writer.write("Hello, world!");
            writer.close();

            System.out.println("Дані успішно записані у файл " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            System.out.println("Дані з файлу " + fileName + ":");
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }

            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
