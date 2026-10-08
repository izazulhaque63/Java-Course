package classandobject.thiskey;

public class cellphone {
    String brand;
    String model;

    public void showDetails() {
        System.out.println("brand: " + brand);
        System.out.println("model: " + model);
    }
    public static void main(String[] args) {
        cellphone c1 = new cellphone();
    }
}
