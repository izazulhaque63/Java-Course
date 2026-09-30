package abstractClass83;

public class testShape {
    static void main(String[] args) {
        //shape Shape = new shape();
        circle Circle = new circle(5);
        square Square = new square(10.5);
        System.out.printf("area of circle is %f\n ", Circle.calculateArea());
        System.out.printf("area of Square is %f\n", Square.calculateArea());
    }

}
