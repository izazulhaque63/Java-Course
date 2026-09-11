import java.util.Scanner;

public class sumofdigit31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to sum of digit");
        System.out.println("please enter your number");
        int num = input.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("your sum of digit is: " + sum);
    }
    public static int sumOfDigits(int num) {
    int sum = 0;
    while(num > 0){
        sum = (sum + num % 10);
        num = num / 10;
    }
        return sum;
    }
}
