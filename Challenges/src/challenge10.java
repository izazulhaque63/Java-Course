import java.util.Scanner;

public class challenge10 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("calculating parameter of rectangle");
        System.out.println("olease enter the all 4 side of parameter area");
        System.out.println("enter the value of A");
        float A = input.nextFloat();
        System.out.println("enter the the value of B");
        float B = input.nextFloat();
        System.out.println("enter the the value of C");
        float C = input.nextFloat();
        System.out.println("enter the the value of D");
        float D = input.nextFloat();
        float parameter = A + B + C + D;
        System.out.println("final value is: " + parameter + "cm");
    }
}
