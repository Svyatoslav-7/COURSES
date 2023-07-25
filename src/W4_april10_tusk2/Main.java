package W4_april10_tusk2;

import java.util.Scanner;

//Використовуючи IntelliJ IDEA, створіть клас Calculator. Напишіть програму – консольний калькулятор.
//Створіть дві змінні з іменами operand1 та operand2. Вкажіть змінним деякі довільні значення. Запропонуйте ввести
//знак арифметичної операції. Візьміть значення, введене користувачем і помістіть його в рядкову змінну sign.
//Для організації вибору алгоритму обчислювального процесу використовуйте перемикач switch. Виведіть на екран результат
//виконання арифметичної операції. У разі використання операції розподілу, організуйте перевірку спроби розподілу на
//нуль. І якщо така є, то скасуйте виконання арифметичної операції та повідомите про помилку користувача.

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double operand1=13;
        double operand2=0;

        System.out.println("Enter what you want do (+ - * /): ");
        String whatDo =scanner.nextLine();

        switch (whatDo){
            case "+":
                double resultp=operand1+operand2;
                System.out.println("You chose "+whatDo+" : "+ resultp);
                break;
            case "-":
                double resultm=operand1-operand2;
                System.out.println("You chose "+whatDo+" : "+ resultm);
                break;
            case "*":
                double resultmn=operand1*operand2;
                System.out.println("You chose "+whatDo+" : "+ resultmn);
                break;
            case "/":
                if (operand2==0){
                    System.out.println("Enter another number for 2nd number.");
                    break;
                }else{
                    double resultdil=operand1/operand2;
                    System.out.println("You chose "+whatDo+" : "+ resultdil);
                    break;
                }
        }

    }
}
