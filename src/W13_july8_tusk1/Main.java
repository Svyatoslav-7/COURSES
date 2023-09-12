package W13_july8_tusk1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть 5 слів:");
        for (int i = 0; i < 5; i++) {
            String word = scanner.nextLine();
            words.add(word);
        }

        doubleValues(words);

        System.out.println("Результат:");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void doubleValues(List<String> words) {
        int originalSize = words.size();

        for (int i = 0; i < originalSize; i++) {
            String word = words.get(i);
            words.add(i+1, word);
            originalSize++;
            i++;
        }
    }
}
