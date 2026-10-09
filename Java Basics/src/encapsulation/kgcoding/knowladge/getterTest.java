package encapsulation.kgcoding.knowladge;

import encapsulation.kgcoding.getterandsette.car;

public class getterTest {
    public static void main(String[] args) {
        car car = new car("red","swift",5,500);
        System.out.println(car.getColor());
        System.out.println(car.getModel());
        
    }
}
