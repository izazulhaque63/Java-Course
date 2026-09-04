import java.util.Scanner;

public class challenge14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to temprature converter");
        System.out.println("calculating Fahrenheit celsius");
        System.out.println("please etner Fahrenheit :");
        float Fahrenheit = input.nextFloat();
        float celsius = (Fahrenheit - 32) * 5.0f / 9.0f;

        System.out.println("your temprature " + Fahrenheit + "celsius");
    }
}
