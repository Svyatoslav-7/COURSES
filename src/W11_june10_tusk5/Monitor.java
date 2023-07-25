package W11_june10_tusk5;

public class Monitor extends Device{
    int resolutionX;
    int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber) {
        super(manufacturer, price, serialNumber);
    }

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor: manufacturer= " + manufacturer +", price= " + price +", serialNumber= " + serialNumber+
                ", X= "+resolutionX+", Y= "+resolutionY;
    }
}
