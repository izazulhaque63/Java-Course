package inheritence.nested;

public class car {
    private int noOFDoors;
    public void repair(){
        tire t = new tire();
    }
    protected  class tire {
        private double width;
        private double pressure;
        private String material;
        public void inflate() {
            noOFDoors = 4;
        }
    }
}

