package W11_june10_tusk5;

public class EthernetAdapter extends Device{

    int speed;
    String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber) {
        super(manufacturer, price, serialNumber);
    }

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }
    @Override
    public String toString() {
        return "EthernetAdapter: manufacturer=" + manufacturer + ", price=" + price + ", serialNumber=" + serialNumber +
                ", speed=" + speed + ", mac=" + mac;
    }
}