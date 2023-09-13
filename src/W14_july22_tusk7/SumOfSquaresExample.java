package W14_july22_tusk7;

/*Створити список та заповнити рандомними числами 10 осередків, потрібно вивести суму квадратів усіх елементів списку.

Ми використовуємо метод map() для зведення квадрат кожного елемента, а потім застосовуємо метод reduce() для обʼєднання всіх елементів в одне число.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SumOfSquaresExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(10) + 1);
        }

        System.out.println("Список чисел: " + numbers);

        int sumOfSquares = numbers.stream()
                .map(number -> number * number)
                .reduce(0, Integer::sum);

        System.out.println("Сума квадратів чисел: " + sumOfSquares);
    }
}

