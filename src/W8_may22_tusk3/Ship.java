package W8_may22_tusk3;

public class Ship extends Vehicle{
    int passenger;
    String port;

    public Ship(int price, int speed, int year, int koorShur, int koorDovj, int passenger, String port) {
        super(price, speed, year, koorShur, koorDovj);
        this.passenger = passenger;
        this.port = port;
    }
}
