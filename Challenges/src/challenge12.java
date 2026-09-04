import java.util.Scanner;

public class challenge12 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("simple intrest calculator");
        System.out.println("please enter the principal amount Rs");
        double p = input.nextDouble();
        System.out.println("please enter the how many years are you boroing this money");
        double t = input.nextDouble();
        System.out.println("please enter the your rate of intrest");
        double r = input.nextDouble();
        double simpleintrest = (p * t * r)/100;
        System.out.println("you final intrest is Rs: " + simpleintrest);
    }
}
