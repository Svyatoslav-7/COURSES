package W13_july11_tusk6;

/*
Необхідно створити рядок із текстом (текст взяти будь-який з інтернету). Розбити цей рядок на 2 підрядки рівної довжині та вивести на екран кожен з нового рядка.
* Завдання із зірочкою - якщо кількість символів не парна, доповнити символом по замовчуванню. Символ любий на Ваш смак наприклад *☺︎☕︎⚓︎⚛︎
Маємо рядок - asdfg
Вивід:
asd
fg⚓︎
*/

public class Main {
    public static void main(String[] args) {
        String str = "Hello world";

        if (str.length() % 2 != 0) {
            str += "⚓";
        }

        int mid = str.length() / 2;
        String firstHalf = str.substring(0, mid);
        String secondHalf = str.substring(mid);

        System.out.println(firstHalf);
        System.out.println(secondHalf);
    }
}
