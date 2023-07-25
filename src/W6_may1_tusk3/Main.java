package W6_may1_tusk3;

//Використовуючи IntelliJ IDEA, створіть клас ReversedArray. Створити метод myReverse(int [] array), який приймає як
//аргумент масив цілочислових елементів і повертає інвертований масив (елементи масиву у зворотному порядку). Створити
//метод int [] subArray (int [] array, int index, int count). Метод повертає частину отриманого як аргумент масиву,
//починаючи з позиції, яка зазначена в аргументі index, розмірністю, що відповідає значенню аргументу count. Якщо
//аргумент count містить значення більше, ніж кількість елементів, що входять до частини вихідного масиву (від
//зазначеного індексу index до індексу останнього елемента), то під час формування нового масиву розмірністю в count,
//заповніть одиницями ті елементи, які не були скопійовані з вихідного масиву.

import java.util.Scanner;

public class Main {
    public static int[] subArray(int[] array, int index, int count) {
        int[] newSecondArray=new int[count];
        for(int i=0; i<count ;i++){

            if(index>= array.length){
                newSecondArray[i]=1;
            }else{newSecondArray[i]=array[index];}
            index++;
        }
        return newSecondArray;
    }
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
        Scanner scanner=new Scanner(System.in);
        int[] array={1,2,3,4,5,6};
        int[] reversedArray=myReverse(array);
        System.out.println("Our reversed array: ");
        System.out.println(" ");
        for(int i =0; i<reversedArray.length;i++){

            System.out.print(reversedArray[i]);

        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("2nd part: ");
        System.out.println("Enter INDEX: ");
        int index=scanner.nextInt();
        System.out.println("Enter count: ");
        int count=scanner.nextInt();

        int[] new2NDArray=subArray(reversedArray, index, count);
        System.out.println("New Array: ");
        for(int q=0;q<new2NDArray.length; q++){
            System.out.print(new2NDArray[q]);
        }



    }
}
