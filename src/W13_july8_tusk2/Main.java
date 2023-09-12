package W13_july8_tusk2;

/*
Мінімальне з N чисел (використовувати LinkedList):

1. Введіть із клавіатури число N.
2. Вважати N цілих чисел і заповнити ними список - метод getIntegerList.
3. Знайти мінімальне число серед елементів списку – метод getMinimum.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = getNFromUser();
        List<Integer> integerList = getIntegerList(n);

        int minimum = getMinimum(integerList);

        System.out.println("Мінімальне число: " + minimum);
    }

    public static int getNFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число N: ");
        return scanner.nextInt();
    }

    public static List<Integer> getIntegerList(int n) {
        List<Integer> integerList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.print("Введіть число: ");
            int number = scanner.nextInt();
            integerList.add(number);
        }

        return integerList;
    }

    public static int getMinimum(List<Integer> integerList) {
        int minimum = Integer.MAX_VALUE;

        for (int number : integerList) {
            if (number < minimum) {
                minimum = number;
            }
        }

        return minimum;
    }
}
