import java.util.Scanner;

public class forprime62 {
    public static void main(String[] args) {
        System.out.println("welcome to using for loop cheaking prime number");
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number");
        int number = input.nextInt();
        System.out.println("your number is: " + (isprime(number) ? "prime": "not prime"));
    }
    public static boolean isprime(int num){
      for (int i = 2; i < num; i++){
          if (num % i == 0){
              return false;
          }
      }
      return true;
    }
}
