import java.util.Scanner;

public class challenge8 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter first number");
        int Firstnum = input.nextInt();
        System.out.println("please enter second number");
        int secondnum = input.nextInt();
        System.out.println(Firstnum + secondnum);
        System.out.println( Firstnum - secondnum);
        System.out.println( Firstnum * secondnum);
        System.out.println( Firstnum / secondnum);
        System.out.println( Firstnum % secondnum);
    }
}
