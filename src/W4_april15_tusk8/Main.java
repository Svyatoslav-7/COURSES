package W4_april15_tusk8;

//Використовуючи IntelliJ IDEA, створіть клас Rectangle. Створіть дві цілочислові змінні та задайте їм деякі значення.
//Застосовуючи техніку вкладених циклів, намалюйте прямокутник із зірочок. Використовуйте значення раніше створених
//змінних для вказівки висоти та ширини прямокутника.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введіть висоту: ");
        int h=scanner.nextInt();
        System.out.println("Введіть висоту: ");
        int l=scanner.nextInt();

        for(int i = 0; i < h; i++) {
            for(int j = 0; j < l; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}
