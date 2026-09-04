import java.util.Scanner;

public class challenge9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("calculating sum of two floating numbers");
        System.out.println("enter the first floating number");
        float firstnum = input.nextFloat();
        System.out.println("enter the second floating number");
        float secondnum = input.nextFloat();
       float product = firstnum * secondnum;
        System.out.println("final value is: " + product);
    }
}
