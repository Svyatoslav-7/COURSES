package W11_june10_tusk5;

public class Device {
    String manufacturer;
    float price;
    String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device: manufacturer= " + manufacturer +", price= " + price +", serialNumber= " + serialNumber;
    }
}

