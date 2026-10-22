package arrays.practice;

import java.util.Scanner;

public class avarage {
    public static void main(String[] args) {
      int[] marks = new int[5];
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of marks");
      marks[0] = sc.nextInt();
      System.out.println("Enter the number of marks");
      marks[1] = sc.nextInt();
      System.out.println("Enter the number of marks");
      marks[2] = sc.nextInt();
        System.out.println("your phy marks is: " + marks[0]);
        System.out.println("your chem marks is: " + marks[1]);
        System.out.println("your math marks is: " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
      System.out.println("your percentage is: " + percentage +"%");









    }
}
