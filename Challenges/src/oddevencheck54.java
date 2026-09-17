import java.util.Scanner;

public class oddevencheck54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to odd and eeven check number");
        System.out.println("please enter your number");
        int number = input.nextInt();
        if (number % 2 ==0 ){
            System.out.println("your given number is even number");
        }else {
            System.out.println("your given number is odd number");
        }
    }
}
