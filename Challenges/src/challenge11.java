import java.util.Scanner;

public class challenge11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("calculating area of triangle");
        System.out.println("please ener base in cm :");
        double base = input.nextDouble();
        System.out.println("please enter your perpendicular height in cm: ");
        double height = input.nextDouble();
        double area = (base * height) / 2;
        System.out.println("your area of triangle is " + area + "cm2");
    }
}
