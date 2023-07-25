package W2_march26_tusk8;

import java.util.Scanner;

//Використовуючи IntelliJ IDEA, створіть клас Volume. Напишіть програму розрахунку об'єму - V та площі поверхні -S
//циліндра. Об'єм V циліндра радіусом – R та висотою – h, обчислюється за формулою: V = πR2 h Площа S поверхні
//циліндра обчислюється за формулою: S = 2πR2 + 2πR2 = 2πR(R+h) Результати розрахунків виведіть на екран.

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter r = ");
        int r = scanner.nextInt();
        System.out.println("Enter h = ");
        int h = scanner.nextInt();
        final double pi=3.14;

        double v=pi*r*2*h;
        double s=2*pi*r*(r+h);

        System.out.println("V = "+v+"; S = "+s);
    }
}
