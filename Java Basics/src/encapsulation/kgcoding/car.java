package encapsulation.kgcoding;

public class car {
    public String color;
    public String model;
    private double fuelLevel;
    long cosOfPurchase;

    @Override
    public String toString() {
        return "car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", cosOfPurchase=" + cosOfPurchase +
                '}';
    }
//    car(){
//
//    }

    public car(String color, String model, double fuelLevel, long cosOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.cosOfPurchase = cosOfPurchase;
    }
}
