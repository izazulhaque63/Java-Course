import java.util.Scanner;

public class challenge15 {
    public static void main(String[] args) {
        System.out.println("welcome to finding gretest number");
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your first number");
        int firstNum = input.nextInt();
        System.out.println("please enter your second number");
        int secondNum = input.nextInt();
        System.out.println("please enter your third number");
        int thirdNum = input.nextInt();
        if (firstNum > secondNum && firstNum > thirdNum){
            System.out.println("first number is greater");
        } else if (secondNum > firstNum && secondNum > thirdNum) {
            System.out.println("second number is greater ");

        } else if (thirdNum > firstNum && thirdNum > secondNum) {
            System.out.println("third number is greater");

        } else {
            System.out.println("your all number is equal");
        }
    }
}
