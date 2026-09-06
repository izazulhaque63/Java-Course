package Conditional.Izazul;

import java.util.Scanner;

public class whileloop {
   static void main(String[] args) {
        System.out.println("welcome to while loop");
        int num = 0;
        while (num <= 5){
            System.out.println(num);
            num++;
        }

        int num = 1;
        while(num<=10) {
            System.out.println(num);
            num++;
        }

       int num = 10;
       while(num>=1) {
            System.out.println(num);
            num--;
        }



       int num = 0;
       while(num<=20) {
           System.out.println(num);
           num = num +2;
       }

       System.out.println("multiplication table");
       Scanner input = new Scanner(System.in);
       System.out.println("please enter the number");



       int number = 5;
       while (number<=10){
           System.out.println(number + "x" + number + "=" + (number * number));
           number++;
       }



   }
}
