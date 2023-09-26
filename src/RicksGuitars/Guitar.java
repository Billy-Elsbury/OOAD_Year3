package RicksGuitars;

public class Guitar {

    public String serialNumber;
    public Double price;
    public String builder;
    public String model;
    public String type;
    public String backwood;
    public String topwood;

    public Guitar(String serialNumber, Double price, String builder, String model, String type, String backwood, String topwood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backwood = backwood;
        this.topwood = topwood;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getBackwood() {
        return backwood;
    }

    public String getTopwood() {
        return topwood;
    }
}
