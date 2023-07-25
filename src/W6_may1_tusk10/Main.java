package W6_may1_tusk10;

//Використовуючи IntelliJ IDEA, створіть клас NumbersCheck. Напишіть метод, який визначатиме:

//1)      чи є введене число позитивним, чи негативним;
//2)      чи є воно простим (використовуйте техніку перебору значень).
//    Просте число – це натуральне число, яке ділиться на 1 й саме на себе. Щоби визначити просте число чи ні, варто
//    знайти всі його цілі дільники. Якщо дільників більше 2-х, то воно не просте;
//3)      чи ділиться воно на 2, 5, 3, 6, 9 без залишку.

import java.util.Scanner;

public class Main {

    public static String[] NumbersCheck(int number) {
        String[] arrayInfo=new String[3];
        if(number>0){
            arrayInfo[0]="Число є позитивне (>0)";
        }else if(number ==0){
            arrayInfo[0]="Число рівне 0";
        }else{arrayInfo[0]="Число є негативне (<0)";}

        int count=0;
        for(int i =1;i<=20; i++){
            if(number%i==0){
                count++;
            }
        }
        if(count==2){
            arrayInfo[1]="Число являється простим";
        }else{arrayInfo[1]="Число не є простим";}

        if(number%2==0 || number%5==0 || number%3==0 ||number%6==0 ||number%9==0){
            arrayInfo[2]="Число ділиться без залишку на : 2, або 5, або 3, або 6, або 9";
        }else{arrayInfo[2]="Число не ділиться без залишку на : 2, або 5, або 3, або 6, або 9";}
        return arrayInfo;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number: ");
        int number=scanner.nextInt();

        String[] infoNumber=NumbersCheck(number);
        for(int i =0; i<infoNumber.length; i++){
            System.out.println(infoNumber[i]);
        }
    }
}
