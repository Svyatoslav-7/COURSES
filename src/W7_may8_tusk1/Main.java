package W7_may8_tusk1;

//Клас Person

//Створити клас Person, який містить:

//1. змінні fullName, age;
//2. методи move() і talk(), у яких просто вивести на консоль повідомлення - "Який Person говорить".
//3. Додайте два конструктори - Person() та Person(fullName, age).
//4. Створіть два об'єкти цього класу. Один об'єкт ініціалізується конструктором Person (), інший – Person (fullName, age).
//5. Викличте методи move() та talk().

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Svyat Yats", 20);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }

}
