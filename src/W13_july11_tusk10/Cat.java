package W13_july11_tusk10;

import java.lang.reflect.Field;

public class Cat {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Animal animal = new Animal();

        Field publicField = animal.getClass().getDeclaredField("publicField");
        publicField.setAccessible(true);
        publicField.set(animal, "New Public Field Value");

        Field protectedField = animal.getClass().getDeclaredField("protectedField");
        protectedField.setAccessible(true);
        protectedField.set(animal, "New Protected Field Value");

        Field privateField = animal.getClass().getDeclaredField("privateField");
        privateField.setAccessible(true);
        privateField.set(animal, "New Private Field Value");

        System.out.println(animal.publicField);
        System.out.println(animal.protectedField);
        System.out.println(animal.privateField);
    }
}
