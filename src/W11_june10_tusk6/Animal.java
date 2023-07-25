package W11_june10_tusk6;

import java.util.Objects;

public class Animal {
    String name;
    int age;
    boolean tail;

    public Animal(String name, int year, boolean tail) {
        this.name = name;
        this.age = year;
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Ім'я: " + name + ", вік: " + age + ", хвіст: " + (tail ? "так" : "ні");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return age == animal.age && tail == animal.tail && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, tail);
    }
}
