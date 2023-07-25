package W6_may1_tusk11;

//Опишіть метод PowerA3(A, B), який обчислює третій ступінь числа A і повертає її до
//змінної B (A – вхідний, B – вихідний параметр; обидва параметри є дійсними).
//За допомогою цієї процедури знайдіть третій ступінь п'яти зазначених чисел

import java.util.Scanner;

public class Main {
    public static double PowerA3(int a, double b) {
        b = Math.pow(a,3);
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number: ");
        int a=scanner.nextInt();
        double b=0;
        System.out.println(PowerA3(a,b));
    }
}
