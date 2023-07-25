package W2_march26_tusk5;

//Дано 3 змінні типу int x = 10, y = 12 і z = 3; Виконайте та розрахуйте результат наступних операцій для цих змінних:

// x += y - x++ * z;

// z = --x - y * 5;

// y /= x + 5% z;

// z = x++ + y * 5;

// x = y - x++ * z;

public class Main {

    public static void main(String[] args) {

        int x=10;
        int y=12;
        int z=3;

        x+= y - x++ * z;
        z = --x - y * 5;
        y /= x + 5% z;
        x = y - x++ * z;
        System.out.println(x);
        System.out.println(z);
        System.out.println(y);
    }
}
