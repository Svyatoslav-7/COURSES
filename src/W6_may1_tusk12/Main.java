package W6_may1_tusk12;

//Опишіть метод PowerA234(A, B, C, D), який обчислює другий, третій і четвертий ступінь числа A і повертає ці
//ступені відповідно до змінних B, C і D (A – вхідний, B, C, D – вихідні параметри; усі параметри є дійсними).
//За допомогою цієї процедури знайдіть другий, третій і четвертий ступені п'яти зазначених чисел.

import java.util.Scanner;

public class Main {
    public static void PowerA234(int a, double b, double c, double d) {
        b=Math.pow(a,2);
        c=Math.pow(a,3);
        d=Math.pow(a,4);
        System.out.println("2a="+b+"; 3a="+c+"; 4a="+d+";");
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double b=0;
        double c=0;
        double d=0;

        for(int i=0; i<5; i++){
            System.out.println("Enter number: ");
            int a=scanner.nextInt();
            PowerA234(a,b,c,d);
        }
    }
}
