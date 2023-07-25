package W4_april10_tusk3;

import java.util.Scanner;

//Використовуючи IntelliJ IDEA, створіть клас Interval. Напишіть програму визначення, чи попадає вказане користувачем
//число від 0 до 100 до числового проміжку [0 - 14] [15 - 35] [36 - 50][50 - 100]. Якщо так, то вкажіть, який саме
//проміжок. Якщо користувач вказує число, що не входить до жодного з наявних числових проміжків, то виводиться
//відповідне повідомлення.

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number (0-100)");
        double num=scanner.nextDouble();

        if(num>=0 && num<=14){
            System.out.println("Plays for your number: 0-14");
        }else if(num>=15 && num<=35){
            System.out.println("Plays for your number: 15-35");

        }else if(num>=36 && num<=50){
            System.out.println("Plays for your number: 36-50");

        }else if (num>=50 && num<=100){
            System.out.println("Plays for your number: 50-100");
        }else{System.out.println("you enter bad number");}

    }
}
