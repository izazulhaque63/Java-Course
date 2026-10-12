package exceptionandfilehandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptiontrace {
    public static void main(String[] args) {
     a();
    }
    public static void a(){
        b();
    }
    public static void b(){
        c();
    }
    public static void c(){
        d();
    }
    public static void d(){
        Scanner sc = new Scanner(System.in);
        System.out.println("please two numbers:");
        int first = sc.nextInt();
        int second = sc.nextInt();
        try {
            int result = first / second;
            System.out.println(result);
        } catch (ArithmeticException e) {
            // System.out.println(e.getMessage());
            System.out.println("divide by zero, enter a valid value");
        }catch (InputMismatchException e){     //we can write multiple catch blocks
            System.out.println(e.getMessage());
        }catch (Throwable th){
            System.out.println("genral exception ");
        }
    }
}
