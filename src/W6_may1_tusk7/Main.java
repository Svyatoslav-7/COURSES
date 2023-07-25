package W6_may1_tusk7;

//Використовуючи IntelliJ IDEA, створіть клас Arrays. Створіть масив розмірністю 10 елементів, виведіть на екран усі
//елементи масиву у зворотному порядку.

public class Main {
    public static int[] myReverse(int [] array) {
        int[] newArray = new int[array.length];
        int counter=array.length;   //=6
        for(int i =0; i<array.length; i++){
            newArray[counter-1]=array[i];
            counter--;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        int[] reversedArray=myReverse(array);
        System.out.println("Our reversed array: ");
        System.out.println(" ");
        for(int i =0; i<reversedArray.length;i++){

            System.out.print(reversedArray[i]+" ");

        }

    }
}
