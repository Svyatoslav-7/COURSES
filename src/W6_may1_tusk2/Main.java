package W6_may1_tusk2;

//Використовуючи IntelliJ IDEA, створіть клас CustomerArray. Створити масив розміру N-елементів, заповнити його
//довільними цілими значеннями (розмір масиву задає користувач). Вивести на екран: найбільше значення масиву, найменше
//значення масиву, загальну суму всіх елементів, середнє арифметичне всіх елементів, вивести всі непарні значення.

import java.util.Scanner;

public class Main {

    public static int largestValue(int[] array) {
        int largest=0;

        for(int i =0; i< array.length; i++){
            if(largest<array[i]){
                largest=array[i];
            }
        }

        return largest;
    }

    public static int smallestValue(int[] array) {
        int smallest=999;

        for(int i =0; i< array.length; i++){
            if(smallest>array[i]){
                smallest=array[i];
            }
        }

        return smallest;
    }

    public static int totalSum(int[] array) {
        int totalSum=0;

        for(int i =0; i< array.length; i++){
            totalSum+=array[i];
        }

        return totalSum;
    }

    public static double average(int[] array) {
        int counter=0;
        int counterOfNumber=0;
        for(int i =0; i< array.length; i++){
            counterOfNumber+=array[i];
            counter++;
        }

        double average=counterOfNumber/counter;

        return average;
    }

    public static void allOdd(int[] array) {
        for(int i =0; i<array.length;i++){
            if(array[i]%2!=0){
                System.out.println(array[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter, how much numbers you want: ");
        int howMuch=scanner.nextInt();

        int[] array=new int[howMuch];

        for(int i =0; i<howMuch;i++){
            int howMuchNeed=howMuch-i;
            System.out.println("Enter number for array (you enter "+ i +"), need "+howMuchNeed+";");
            int numberForArray=scanner.nextInt();
            array[i]=numberForArray;
        }
        System.out.println("Your array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

        System.out.println("Choose what are you want to do (1-5):");
        System.out.println("1) the largest value of the array (найбільше значення масиву);");
        System.out.println("2) the smallest value of the array (найменше значення масиву);");
        System.out.println("3) the total sum of all elements (загальну суму всіх елементів);");
        System.out.println("4) average of all elements (середнє арифметичне всіх елементів);");
        System.out.println("5) print all odd values (вивести всі непарні значення);");

        int whatDo=scanner.nextInt();

        switch (whatDo){
            case 1:
                System.out.println(largestValue(array));
                break;
            case 2:
                System.out.println(smallestValue(array));
                break;
            case 3:
                System.out.println(totalSum(array));
                break;
            case 4:
                System.out.println(average(array));
                break;
            case 5:
                allOdd(array);
                break;
            default:
                System.out.println("You write not correct number.");
        }

    }

}
