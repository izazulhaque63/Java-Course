import java.util.Scanner;

public class challenge17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("cheaking your number is odd or even");
        System.out.println("please enter your number");
        int num = input.nextInt();
        if (num % 2 == 0){
            System.out.println("yous number is odd: ");
        }else {
            System.out.println("your number is even");
        }
    }
}
