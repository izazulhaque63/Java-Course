package abstractClass;

public class square extends shape {

   private final double sideInCm;

    public double getSideInCm() {
        return sideInCm;
    }

    public square(double sideInCm) {
        this.sideInCm = sideInCm;
    }

    @Override
    public double calculateArea() {
        return Math.pow(sideInCm * sideInCm, 2);
    }
}
