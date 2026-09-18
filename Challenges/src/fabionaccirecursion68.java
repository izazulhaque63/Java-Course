import java.util.Scanner;

public class fabionaccirecursion68 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to printing fabonnaci series");
        System.out.println("please enter thr number element to be printed");
        int count = input.nextInt();
        for (int i = 0; i <= count; i++) {
            System.out.println(fibonacci(i) + "");
        }

    }

    public static int fibonacci(int position) {
        System.out.println(".");
        if (position == 1) {
            return 0;
        }
        if (position == 2) {
            return 1;
        }
        return fibonacci(position - 1)
                + fibonacci(position - 2);
    }
}


