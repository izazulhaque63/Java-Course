import java.util.Scanner;

public class mintwonum53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("finding to the minimum two number");
        System.out.println("please enter the first number");
        int first = input.nextInt();
        System.out.println("please enter the second number");
        int second = input.nextInt();
        if (first < second){
            System.out.println("your first number is minimum");
        } else if (second < first ) {
            System.out.println("your second number is minimum");

        } else if (first == second && second == first) {
            System.out.println("your both number is equal");

        } else {
            System.out.println("else your number is zero");
        }
    }
}
