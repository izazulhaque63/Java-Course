import java.util.Scanner;

public class challange13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("compound intrest calculator");
        System.out.println("please enter the principal amount Rs");
        double p = input.nextDouble();
        System.out.println("please enter the how many years are you boroing this money");
        double t = input.nextDouble();
        System.out.println("please enter the your rate of intrest");
        double r = input.nextDouble();
        double compoundintrest = p * Math.pow((1 + r / 100),t);
        System.out.println("you final intrest is Rs: " + compoundintrest);
    }
}
