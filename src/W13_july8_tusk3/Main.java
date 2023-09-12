package W13_july8_tusk3;

/*
Програма визначає, яка сім'я (прізвище) живе у місті:
Приклад введення:
· Москва
· Іванови
· Київ
· Петрови
· Лондон
· Абрамовичі
Приклад введення:
· Лондон
Приклад виведення:
· Абрамовичі
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> cityFamilyMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Введення міст та відповідних прізвищ з клавіатури та додавання їх до мапи
        System.out.println("Введіть місто та прізвище:");
        while (true) {
            String city = scanner.nextLine();

            // Якщо місто - "кінець", завершуємо введення
            if (city.equals("кінець")) {
                break;
            }

            String family = scanner.nextLine();

            cityFamilyMap.put(city, family);
        }

        // Введення міста
        System.out.print("Введіть місто: ");
        String cityInput = scanner.nextLine();

        // Виведення прізвища сім'ї, що живе у введеному місті
        if (cityFamilyMap.containsKey(cityInput)) {
            String family = cityFamilyMap.get(cityInput);
            System.out.println("Прізвище: " + family);
        } else {
            System.out.println("Сім'я не знайдена для даного міста.");
        }
    }
}
