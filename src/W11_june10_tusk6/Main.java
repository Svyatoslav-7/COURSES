package W11_june10_tusk6;

/*
Використовуючи Intelij IDEA, створити проект, пакет. Створити клас Animal з ім'ям String, int віком, хвостом Boolean.
У класі перевизначити метод toString, щоб висновок був наступним «Ім'я: Васька, вік: 45, хвіст: ні». У класі Animal
перевизначити методи equals & hashCode.
*/

public class Main {
    public static void main(String[] args) {
        Animal animal1=new Animal("Кіт", 12, true);
        Animal animal2=new Animal("Пес", 12, true);
        System.out.println(animal1.toString());
        System.out.println(animal2.toString());

        if(animal1.equals(animal2)){
            System.out.println("Тварини є одинакові");
        }else{
            System.out.println("Тварини є різними");
        }
    }

}
