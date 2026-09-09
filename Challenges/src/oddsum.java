import java.util.Scanner;

 class oddSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to sum of all odd numbers");
        System.out.println("Please enter your number:");

        int num = input.nextInt();

        int sum = calculateoddSum(num);

        System.out.println("Odd sum till " + num + " is: " + sum);

        input.close();
    }

    public static int calculateoddSum(int num) {
        int sum = 0;
        int i = 1;

        while (i <= num) {
            sum += i;
            i += 2;
        }

        return sum;
    }
}