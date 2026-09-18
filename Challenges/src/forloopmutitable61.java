import java.util.Scanner;

public class forloopmutitable61 {
    public static void main(String[] args) {
        System.out.println("welcome to using for loop multiplication table");
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number");
        int number = input.nextInt();
        for (int i = 1; i<=10; i++){
            System.out.println(number + "x" + i + "=" + (number * i));
        }
    }
}
