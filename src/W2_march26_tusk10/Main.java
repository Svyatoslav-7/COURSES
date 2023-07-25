package W2_march26_tusk10;

import java.util.Scanner;

//Використовуючи IntelliJ IDEA, створіть проект із класом main. Створіть дві цілі перемінні і виведіть на екран
//результати всіх арифметичних операцій над цими двома змінними.

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a = ");
        int a = scanner.nextInt();

        System.out.println("Enter b = ");
        int b = scanner.nextInt();

        int pl = a+b;
        int vid = a-b;
        double dil =a/b;
        int mnoj=a*b;

        System.out.println(pl);
        System.out.println(vid);
        System.out.println(dil);
        System.out.println(mnoj);
    }
}
