package W9_may27_tusk1;

public class Car {
    private String model;
    private int power;
    private int speed;
    private int price;
    private final int yearOfManufacture;
    {yearOfManufacture=1967;}

    public Car(String model, int power, int speed, int price) {
        this.model = model;
        this.power = power;
        this.speed = speed;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }
}
