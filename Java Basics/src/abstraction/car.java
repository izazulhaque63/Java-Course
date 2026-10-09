package abstraction;

public class car extends vechile{
    private String doors;
    private String fuel;

    @Override
    public void makeStartSoud() {
        System.out.println("Making start soud");
    }

    public car(int noOfTires, String carName) {
        super(noOfTires, carName);



    }
}
