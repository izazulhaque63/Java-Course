import java.util.Scanner;

public class swaping {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to swaping problem");
        System.out.println("please enter value of A");
        int a = input.nextInt();
        System.out.println("please enter value of B");
        int b = input.nextInt();
        int c = a;
            a = b;
            b = c;
        System.out.println("swapping done");
        System.out.println("value of A is :" + a);
        System.out.println("value of B is :" + b);


    }
}
