package classandobject;

public class car {
    int noOfWheels;

    String color;

    float maxSpeed;

    float currentFuelInLiters;

    int noOfSeats;

    public void drive(){
        if (currentFuelInLiters == 0 ){
            System.out.println("your car fuel is low ");
        } else if (currentFuelInLiters < 5) {
            System.out.println("please refuel ");
            currentFuelInLiters--;
        }else {
            System.out.println("car is driving");
            currentFuelInLiters--;
        }

    }
    public void addFuel(float fuel){
     currentFuelInLiters += fuel;
    }
   public float getCurrentFuelLevel(){
        return currentFuelInLiters;
   }
}
