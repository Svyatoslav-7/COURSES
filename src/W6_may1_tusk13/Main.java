package W6_may1_tusk13;

//Використовуючи IntelliJ IDEA, створіть клас Calculator. Створіть метод з ім'ям calculate, який приймає як
// параметри три цілих аргументи та виводить на екран середнє арифметичне значень аргументів.

import java.util.Scanner;

public class Main {
    public static void calculate(int a, int b, int c) {
        double d=(a+b+c)/3;
        System.out.println(d);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a =scanner.nextInt();
        System.out.println("Enter 2nd number: ");
        int b=scanner.nextInt();
        System.out.println("Enter 3rd number: ");
        int c=scanner.nextInt();
        calculate(a,b,c);
    }
}
