package W2_march26_tusk7;

import java.util.Scanner;
import static java.lang.Math.pow;

//Використовуючи IntelliJ IDEA, створіть клас Circle. Створіть константу під назвою PI (число π «пі»),
//створіть змінну радіус з назвою – r. Використовуючи формулу πR2 , обчисліть площу кола та виведіть результат на екран.

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double pi = 3.14;

        System.out.println("Enter r: ");
        double r=scanner.nextInt();

        double s=pi*pow(r,2);

        System.out.println("S = "+s);
    }
}
