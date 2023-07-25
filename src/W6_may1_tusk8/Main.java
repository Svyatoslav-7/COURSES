package W6_may1_tusk8;

//Використовуючи IntelliJ IDEA, створіть клас Arithmetics. Створіть чотири методи для виконання арифметичних операцій
//з іменами: add – додавання, sub – віднімання, mul – множення, div – ділення. Кожен метод має приймати два цілих
//аргументи та виводити на екран результат виконання арифметичної операції відповідної імені методу. Метод поділу div
//має виконувати перевірку спроби поділу на нуль. Потрібно надати користувачеві можливість вводити з клавіатури значення
//операндів і знак арифметичної операції для виконання обчислень.

import java.util.Scanner;

public class Main {
    public static double add(int fstNum, int sndNum) {
        int addNumber=fstNum+sndNum;
        return addNumber;
    }
    public static int sub(int fstNum, int sndNum) {
        int subNumber=fstNum-sndNum;
        return subNumber;
    }
    public static int mul(int fstNum, int sndNum) {
        int mulNumber=fstNum*sndNum;
        return mulNumber;
    }
    public static double div(int fstNum, int sndNum) {
        double divNumber = 0.1;
        if(sndNum!=0){
            divNumber=(double) fstNum/sndNum;
        }else {
            System.out.println("Enter correct 2nd number");
        }

        return divNumber;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int fstNum=scanner.nextInt();
        System.out.println("Enter 2st number: ");
        int sndNum=scanner.nextInt();
        scanner.nextLine();
        System.out.println(" ");
        System.out.println("Enter what ate you want to do (+,-,*,/)");
        String whatDo=scanner.nextLine();

        switch (whatDo){
            case "+":
                System.out.println(add(fstNum,sndNum));
                break;
            case "-":
                System.out.println(sub(fstNum,sndNum));
                break;
            case "*":
                System.out.println(mul(fstNum,sndNum));
                break;
            case "/":
                System.out.println(div(fstNum,sndNum));
                break;
            default:
                System.out.println("You enter nut correct number.");
        }
    }
}
