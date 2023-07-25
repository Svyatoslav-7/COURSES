package W10_june3_tusk2;

/*
Використовуючи Intelij IDEA, створити проект, пакет. Використовуючи клас Zoo Завдання 2, видалити 3, 5, 7 тварин,
дізнатися розмір списку і вивести в консоль.
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
        zoo.deleteAnimals(zoo.animals);
        System.out.println("New list if animals: ");
        zoo.enterAnimals(zoo.animals);
    }
}