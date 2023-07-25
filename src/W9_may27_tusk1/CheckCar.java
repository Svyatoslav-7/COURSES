package W9_may27_tusk1;

import java.util.ArrayList;
import java.util.List;

public class CheckCar {
    private List<Car> carList;

    public CheckCar() {
        carList = new ArrayList<>();
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public Car getFastestCar() {
        Car fastestCar = null;
        int maxSpeed = Integer.MIN_VALUE;
        for (Car car : carList) {
            if (car.getSpeed() > maxSpeed) {
                maxSpeed = car.getSpeed();
                fastestCar = car;
            }
        }
        return fastestCar;
    }

    public Car getMostExpensiveCar() {
        Car mostExpensiveCar = null;
        int maxPrice = Integer.MIN_VALUE;
        for (Car car : carList) {
            if (car.getPrice() > maxPrice) {
                maxPrice = car.getPrice();
                mostExpensiveCar = car;
            }
        }
        return mostExpensiveCar;
    }

    public Car getMostPowerfulCar() {
        Car mostPowerfulCar = null;
        int maxPower = Integer.MIN_VALUE;
        for (Car car : carList) {
            if (car.getPower() > maxPower) {
                maxPower = car.getPower();
                mostPowerfulCar = car;
            }
        }
        return mostPowerfulCar;
    }

    public void printCarInfo(Car car) {
        System.out.println("Brand: " + car.getModel());
        System.out.println("Power: " + car.getPower());
        System.out.println("Speed: " + car.getSpeed());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Year: " + car.getYearOfManufacture());
    }
}
