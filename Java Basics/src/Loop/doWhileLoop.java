package Loop;

import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("do whie loop practice");
        int age = 0;
        do {
            System.out.println("please enter your age: ");
             age = input.nextInt();

        }while (age < 0 || age >100 );
        System.out.println("your age is: " + age);



    }
}
