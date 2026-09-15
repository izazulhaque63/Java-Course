import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to sum of digit");
        System.out.println("please enter the number");
        int num = input.nextInt();
        int sum = 0;
        int digit;
        while(num > 0){
            num = num % 10;
            sum = sum + num;
            num = num / 10;
        }
        System.out.println("your sum of digit is: " + sum);
    }
}
