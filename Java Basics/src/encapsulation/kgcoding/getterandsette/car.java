package encapsulation.kgcoding.getterandsette;

public class car {
    private String color;
    private String model;
    private double fuelLevel;
    private long cosOfPurchase;

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public car(String color, String model, double fuelLevel, long cosOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.cosOfPurchase = cosOfPurchase;
    }
}
