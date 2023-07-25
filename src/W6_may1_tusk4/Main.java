package W6_may1_tusk4;

//Використовуючи IntelliJ IDEA, створіть клас UserArray. Створити метод, який виконуватиме збільшення довжини масиву,
//переданого як аргумент, на 1 елемент. Елементи масиву мають зберегти своє значення та порядок індексів. Створити
//метод, який приймає два аргументи, перший аргумент типу int [] array, другий аргумент типу int value. У тілі методу
//реалізуйте можливість додавання другого аргументу методу в масив за індексом 0, водночас довжина нового масиву має
//збільшитися на 1 елемент, а елементи одержуваного масиву як перший аргумент мають скопіюватися в новий масив починаючи
//з індексу 1.

import java.util.Scanner;

public class Main{
    public static int[] secondNewArray(int[] array, int value) {
        int counArrayLength=array.length;
        int[] secNewArray=new int[counArrayLength+1];
        secNewArray[0]=value;
        for(int i =1;i<secNewArray.length; i++){
            secNewArray[i]=array[i-1];
        }
        return secNewArray;
    }
    public static int[] addNumber(int[] array, int number) {
        int counter=array.length+1;
        int[] newArray=new int[counter];
        for(int i =0; i<array.length; i++){
            newArray[i]=array[i];
        }
        newArray[counter-1]=number;
        return newArray;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] array={1,2,3,4,5};
        System.out.println("Enter number: ");
        int number=scanner.nextInt();
        int[] newArray=addNumber(array, number);
        for(int i=0; i<newArray.length; i++){
            System.out.print(newArray[i]);
        }
        System.out.println(" ");
        System.out.println("2ndp");
        System.out.println(" ");

        System.out.println("Enter number to add for array on 1st position: ");
        int value =scanner.nextInt();

        int[] secondNewArray=secondNewArray(newArray, value);
        for(int q=0; q<secondNewArray.length;q++){
            System.out.print(secondNewArray[q]);
        }
    }
}
