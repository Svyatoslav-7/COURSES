package W8_may22_tusk6;

//Використовуючи IntelliJ IDEA, створіть проект. Потрібно: Створити клас Printer. У тілі класу створіть метод void
//print(String value), який виводить на екран значення аргументу. Реалізуйте можливість того, щоб у разі успадкування
//від даного класу інших класів, та виклику відповідного методу їх екземпляра, рядки, передані як аргументи методів,
//виводилися різними кольорами. Обязательно используйте приведення типів.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Choose color (red-R, yellow-Y, green-G)");
        String color=scanner.nextLine();
        System.out.println("Enter massage what you want to see: ");
        String massage=scanner.nextLine();

        if(color.equals("R")){
            Red red=new Red(massage);
            red.print(massage);
        }else if(color.equals("Y")){
            Yellow yellow=new Yellow(massage);
            yellow.print(massage);
        }else if(color.equals("G")){
            Green green=new Green(massage);
            green.print(massage);
        }else{
            Printer printer=new Printer(massage);
            printer.print(massage);
        }
    }
}