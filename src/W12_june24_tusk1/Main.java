package W12_june24_tusk1;

/*
Виведення на екран елементів List: Створити список, заповнити його на 10 елементів та вивести на екран вміст,
використовуючи iterator.
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> animals=new ArrayList<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Fish");
        animals.add("Hamster");
        animals.add("Shark");
        animals.add("Elephant");
        animals.add("Lizard");
        animals.add("Crocodile");
        animals.add("Lion");
        animals.add("Tiger");


        Iterator<String> iterator=animals.iterator();

        while(iterator.hasNext()){
            String animal = iterator.next();

            System.out.println(animal);
        }
    }
}
