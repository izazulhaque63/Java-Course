import java.util.Scanner;

public class challenge2 {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to our calculator");
        System.out.println("please enter your first number");
        int Firstnum = input.nextInt();
        System.out.println("please enter the second number");
        int Secondnum = input.nextInt();
        int sum = Firstnum + Secondnum;
        System.out.println("your sum is: " + sum);

    }

}
