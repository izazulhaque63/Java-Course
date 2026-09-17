import java.util.Scanner;

public class absloute55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to finding absloute value");
        System.out.println("please enter your number");
        int number = input.nextInt();
        int result = number >= 0 ? number : -number;
        System.out.println("your absloute value is: " + result);

    }
}
