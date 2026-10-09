package abstraction;

public class testabstract {
    public static void main(String[] args) {
       // vechile veh = new vechile(1, "Ford");

        car car = new car(1, "Ford");
        System.out.println(car);
        car.commute();
        car.makeStartSoud();
    }
}
