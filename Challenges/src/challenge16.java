import java.util.Scanner;

public class challenge16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("number cheacking");
        System.out.println("please enter your number");
        int num = input.nextInt();
        if (num > 0){
            System.out.println("your number is positive: ");
        } else if (num < 0) {
            System.out.println("your number is negative");

        }else{
            System.out.println("your number is zero");
        }
    }
}
