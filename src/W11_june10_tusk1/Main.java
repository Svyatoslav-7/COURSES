package W11_june10_tusk1;

/*
Створіть проект за допомогою IntelliJ IDEA. Створіть перерахунковий тип (enum) Animals, що містить конструктор, який
повинен набувати цілого числа (вік тварини), і містити перевантажений метод toString(), який повинен повертати назву
екземпляра та вік тварини.
*/

public class Main {
    public static void main(String[] args) {
        Animal.Animals animal = Animal.Animals.TIGER;
        System.out.println(animal.toString());
    }
}