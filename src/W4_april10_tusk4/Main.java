package W4_april10_tusk4;

import java.util.Scanner;
import java.nio.charset.Charset;

//Використовуючи IntelliJ IDEA, створіть клас Translator. Напишіть програму українсько-російський перекладач.
//Програма знає 10 слів про погоду. Потрібно, щоб користувач вводив слово російською, а програма давала йому
//переклад англійською мовою. Якщо користувач ввів слово, для якого немає перекладу, слід вивести повідомлення,
//що такого слова немає.

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, String.valueOf(Charset.forName("UTF-8")));

        System.out.println("Enter your word:"); // погода,дождь,ветер,холод,жара,гроза, туча, влага, ураган,сухо.
        String word=scanner.nextLine();
        switch (word) {
            case "погода":
                System.out.println("You enter" +word+"; translate is :weather" );
                break;
            case "дождь":
                System.out.println("You enter" +word+"; translate is :rain" );break;
            case "ветер":
                System.out.println("You enter" +word+"; translate is :wind" );break;
            case "холод":
                System.out.println("You enter" +word+"; translate is :cold" );break;
            case "жара":
                System.out.println("You enter" +word+"; translate is :heat" );break;
            case "гроза":
                System.out.println("You enter" +word+"; translate is :thunderstorm" );break;
            case "туча":
                System.out.println("You enter" +word+"; translate is :cloud" );break;
            case "влага":
                System.out.println("You enter" +word+"; translate is :damp" );break;
            case "ураган":
                System.out.println("You enter" +word+"; translate is :hurricane" );break;
            case "сухо":
                System.out.println("You enter" +word+"; translate is :dry" );break;
            default:
                System.out.println("You enter word what i don`t know, use another one.");
                break;
        }
    }
}
