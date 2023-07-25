package W6_may1_tusk9;

//Використовуючи IntelliJ IDEA, створіть клас Conversion. Напишіть програму, яка конвертуватиме валюти. Користувач вводить:

//1)      суму грошей у певній валюті;
//2)      курс конвертації в іншу валюту.

//Організуйте виведення результату операції конвертування валюти на екран.

import java.util.Scanner;

public class Main {
    public static double Conversion(int money, String whatHave, String whatDo) {
        double conversionMoney=0;
        switch (whatHave){
            case "E":
                if(whatDo=="D"){
                    conversionMoney=(money/40.85)*37.5;         //E->D
                }else{conversionMoney=money*40.85;}             //E->G
                break;
            case "D":
                if(whatDo=="E"){
                    conversionMoney=(money/37.5)*40.85;         //D->E
                }else{conversionMoney=money*37.5;}             //D->G
                break;
            case "G":
                if(whatDo=="E"){
                    conversionMoney=money/40.85;         //G->E
                }else{conversionMoney=money/37.5;}             //G->D
                break;
            default:
                System.out.println("Bad choice :)");
        }
        return conversionMoney;
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Our course(to grivnya): D 37.5/E 40.85");
        System.out.println("Enter valur of money: ");
        int money=scanner.nextInt();
        scanner.nextLine();
        System.out.println(" ");
        System.out.println("Choose value what you have (E- Euro, D- Dollar, G-Grivnya): ");
        String whatHave = scanner.nextLine();
        System.out.println(" ");
        System.out.println("In what you want change (E- Euro, D- Dollar, G-Grivnya)");
        String whatDo=scanner.nextLine();
        if(whatHave==whatDo){
            System.out.println("You don`t need change money");
        }else{
            System.out.println(Conversion(money, whatHave, whatDo));
        }
    }
}
