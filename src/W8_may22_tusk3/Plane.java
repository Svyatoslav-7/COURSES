package W8_may22_tusk3;

public class Plane extends Vehicle{
    int height;
    int passenger;


    public Plane(int price, int speed, int year, int koorShur, int koorDovj, int height, int passenger) {
        super(price, speed, year, koorShur, koorDovj);
        this.height = height;
        this.passenger = passenger;
    }
}
