package W6_may1_tusk14;

//Використовуючи IntelliJ IDEA, створіть клас Bank. Уявіть, що ви реалізуєте програму для банку, яка допомагає визначити,
// погасив клієнт кредит чи ні. Припустимо, щомісячна сума платежу має становити 100 грн. Клієнт має виконати 7 платежів,
// але може платити рідше великими сумами. Тобто може двома платежами по 300 і 400 грн закрити весь борг.
//Створіть метод, який як аргумент прийматиме суму платежу, введену економістом банку. Метод виводить на екран
// інформацію про стан кредиту (сума заборгованості, сума переплат, повідомлення про відсутність боргу).

import java.util.Scanner;

public class Main {
    public static void calculate(int credit, int howMuchPay) {
        int info=credit-howMuchPay;
        System.out.print("Your credit is: "+ credit+", you pay now: "+howMuchPay);
        if(info==0){
            System.out.print(". Your finish your credit!");
        }else{
            double weeks=info/100;
            System.out.print(". You must pay: "+info+". This is "+ weeks+" weeks pay for 100 grn.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int credit=700;
        System.out.println("Enter how much you pay: ");
        int howMuchPay=scanner.nextInt();
        calculate(credit, howMuchPay);
    }
}
