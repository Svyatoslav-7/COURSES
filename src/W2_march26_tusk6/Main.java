package W2_march26_tusk6;
import java.util.Scanner;

//Використовуючи IntelliJ IDEA, створіть клас Arithmetic Average. Обчисліть середнє арифметичне трьох цілих значень
//і виведіть його на екран. З якою проблемою ви зіткнулися? Який тип змінних краще використовуватиме коректне
// відображення результату?

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double n1=scanner.nextInt();
        System.out.println("Enter second number: ");
        double n2=scanner.nextInt();
        System.out.println("Enter third number: ");
        double n3=scanner.nextInt();

        double average=(n1+n2+n3)/3;

        System.out.println("Average : "+average);
    }
}
