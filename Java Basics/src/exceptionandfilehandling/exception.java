package exceptionandfilehandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please two numbers:");
        int first = sc.nextInt();
        int second = sc.nextInt();
        int result = first / second;
        System.out.println(result);

    }
}
