import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to recurion examples");
        System.out.println("please enter your number");
        int number = input.nextInt();
        long fact = factorial(number);
        System.out.println("your factorial is fact " + fact);

    }
    public static long factorial(int number){
        System.out.println("function called for: " + number);
        if (number == 1){
            return 1;
        }
        return number * factorial(number-1);
    }

//    public static long factorialItretive(int number) {
//        long result = 1;
//        for (int i = 0; i <= number; i++) {
//            result *= i;
//        }
//        return result;
//    }

}