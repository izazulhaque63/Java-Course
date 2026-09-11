import java.util.Scanner;

public class checkprime33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to checking prime number");
        System.out.println("please enter your number");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        if (isPrime){
            System.out.println("your number is prime number");
        }else {
            System.out.println("your number is not prime number");
        }
    }
    public static boolean isPrime(int num){
        int i = 2;
        while (i < num){
            if (num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
