package abstractClass;

public class circle extends shape{
    public circle(double radiusINCm) {
        this.radiusINCm = radiusINCm;
    }

    private final double radiusINCm;

    public double getRadiusINCm() {
        return radiusINCm;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radiusINCm,2);
    }
}
