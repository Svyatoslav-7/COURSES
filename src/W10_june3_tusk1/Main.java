package W10_june3_tusk1;

/*
Використовуючи Intelij IDEA, створити проект, пакет. Створити клас Zoo. У класі створити список, який записати 8
тварин через метод add(index, element). Вивести список у консоль.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Zoo zoo=new Zoo();

        zoo.addAnimals(zoo.animals, "Лев");
        zoo.addAnimals(zoo.animals, "Тигр");
        zoo.addAnimals(zoo.animals, "Слон");
        zoo.addAnimals(zoo.animals, "Їжак");
        zoo.addAnimals(zoo.animals, "Кінь");
        zoo.addAnimals(zoo.animals, "Ведмідь");
        zoo.addAnimals(zoo.animals, "Мавпа");
        zoo.addAnimals(zoo.animals, "Кіт");

        zoo.enterAnimals(zoo.animals);
    }
}
