package abstraction;

import java.lang.invoke.StringConcatFactory;

public abstract class vechile {
    private int noOfTires;
    private String carName;

    public abstract void makeStartSoud();

    public vechile(int noOfTires, String carName) {
        this.noOfTires = noOfTires;
        this.carName = carName;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void vechileinfo(){
        System.out.println("im giving vechile information");
    }
    public void commute(){
        System.out.println("im giving commute information");
    }
}
