package W11_june10_tusk3;

public class Price {
    private String productName;
    private String storeName;
    private double priceProduct;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public Price(String productName, String storeName, double price) {
        this.productName = productName;
        this.storeName = storeName;
        this.priceProduct = price;
    }

    public String getProductName() {
        return productName;
    }

    public String getStoreName() {
        return storeName;
    }

    public double getPriceProduct() {
        return priceProduct;
    }
}
