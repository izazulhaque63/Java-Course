import classandobject.cars;

class tostringMethod {
    int noOfWheels;

    String color;

    float maxSpeed;

    float currentFuelInLiters;
    int noOfSeats;

    public tostringMethod(int noOfWheels, String color, float maxSpeed, float currentFuelInLiters, int noOfSeats) {
        this.noOfWheels = noOfWheels;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentFuelInLiters = currentFuelInLiters;
        this.noOfSeats = noOfSeats;
    }

    @Override
    public String toString() {
        return "cars{" +
                "noOfWheels=" + noOfWheels +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", currentFuelInLiters=" + currentFuelInLiters +
                ", noOfSeats=" + noOfSeats +
                '}';
    }
//    @Override
//    public String toString() {
//        return "my car name is swift: ";


    public static void main(String[] args) {
        tostringMethod swift = new tostringMethod(4, "black", 150, 3, 6);
        System.out.println(swift);
    }

}


 
 


