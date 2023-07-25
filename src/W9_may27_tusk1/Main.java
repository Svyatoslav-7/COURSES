package W9_may27_tusk1;

//Завдання TestDrive

//Створити клас - якась невідома машина

//Клас має поля

//model - назва машини
//power - від 0.0 до 200.0
//speed - від 0 до 320
//price - від 0.0 до 50000.0
//yearOfManufacture - для всіх один рік 1967

//Створити 4 екземляри машин

//Ford
//Mitsubishi
//Toyota
//KIA

//Створити клас - CheckCar

//Цей клас повинен:

//- мати список машин які які будуть передавати на перевірку
//- мати метод який отримує якусь машину і додає її в свій список
//- мати метод який повертає найшвидшу машину
//- мати метод який повертає найдорожчу машину
//- мати метод який повертає найпотужнішу машину
//- всі методи які повертають машини - найшвидшу/найдорожчу/найпотужнішу - мають вивести про неї всю інформацію у форматі

//Brand: KIA Rio
//Power: 600
//Speed: 189
//Price: 3458.90
//Year:  1967

//* Статичні змінні використовувати заборонено

public class Main {
    public static void main(String[] args) {
        Car ford=new Car("Fiesta", 200, 170, 7000);
        Car mitsubishi=new Car("L200", 190, 320, 39000);
        Car toyota=new Car("A8", 200, 260, 47000);
        Car kia=new Car("Forte", 180, 200, 27000);

        CheckCar checkCar = new CheckCar();

        checkCar.addCar(ford);
        checkCar.addCar(mitsubishi);
        checkCar.addCar(toyota);
        checkCar.addCar(kia);

        System.out.println("Faster car: ");
        Car fastestCar = checkCar.getFastestCar();
        checkCar.printCarInfo(fastestCar);

        System.out.println(" ");
        System.out.println("Most expensive car: ");
        Car mostExpensiveCar = checkCar.getMostExpensiveCar();
        checkCar.printCarInfo(mostExpensiveCar);

        System.out.println(" ");
        System.out.println("Most powerful car");
        Car mostPowerfulCar = checkCar.getMostPowerfulCar();
        checkCar.printCarInfo(mostPowerfulCar);
    }
}
