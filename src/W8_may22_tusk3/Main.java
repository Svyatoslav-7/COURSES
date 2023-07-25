package W8_may22_tusk3;

//Використовуючи IntelliJ IDEA, створіть проект. Потрібно: Створити клас Vehicle. У тілі класу створіть поля: координати
//та параметри суден (ціна, швидкість, рік випуску). Створіть 3 похідних класи Plane, Саг та Ship. Для класу Plane має
//бути визначена висота та кількість пасажирів. Для класу Ship – кількість пасажирів та порт приписки. Написати
//програму, яка виводить на екран інформацію про кожен засіб пересування.

public class Main {
    public static void main(String[] args) {
        Plane plane=new Plane(2000, 400, 2012, 12, 20, 3000, 15);
        Ship ship=new Ship(700, 200, 2000, 4, 54, 14, "Oklahoma");
        Car car=new Car(900, 300, 2018, 49, 12);
        System.out.println("Your transport is plane, info: price: "+plane.price+"; speed: "+plane.speed+"; year: "
                +plane.year+"; height: "+plane.height+"; passenger: "+plane.passenger+"; koordinatu( shurota:"
                +plane.koorShur+"; dovjuna: "+plane.koorDovj+").");

        System.out.println("Your transport is ship, info: price: "+ship.price+"; speed: "+ship.speed+"; year: "
                +ship.year+"; passenger: "+ship.passenger+"; port: "+ship.port+"; koordinatu( shurota:"
                +ship.koorShur+"; dovjuna: "+ship.koorDovj+").");

        System.out.println("Your transport is car, info: price: "+car.price+"; speed: "+car.speed+"; year: "
                +car.year+"; koordinatu( shurota:" +car.koorShur+"; dovjuna: "+car.koorDovj+").");
    }
}
