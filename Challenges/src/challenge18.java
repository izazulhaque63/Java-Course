import java.util.Scanner;

public class challenge18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("cheaking leap year");
        System.out.println("please enter your year");
        int year = input.nextInt();
        if (year % 400 == 0){
            System.out.println("given year is leap year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("your given year is leap year");

        }else {
            System.out.println("your given year is not leap year");
        }
    }
}
