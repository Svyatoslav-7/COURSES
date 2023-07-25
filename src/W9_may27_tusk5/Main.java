package W9_may27_tusk5;

/*
Напишіть на ConverterTemperature клас для конвертації з градусів за Цельсієм в Кельвіни, Фаренгейти. У класу має бути
метод convert, який робить конвертацію.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter what type of temperature you have (Kelvin- K, Celsius- C, Fahrenheit- F): ");
        String whatHave=scanner.nextLine();

        System.out.println("How much you have it: ");
        double temperature=scanner.nextDouble();
        scanner.nextLine();

        System.out.println("In what you want swap it (Kelvin- K, Celsius- C, Fahrenheit- F): ");
        String whatWant=scanner.nextLine();

        ConverterTemperature converterTemperature=new ConverterTemperature(temperature);

        converterTemperature.convert(temperature, whatHave, whatWant);
    }
}
