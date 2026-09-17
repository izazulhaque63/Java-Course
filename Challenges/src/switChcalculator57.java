import java.util.Scanner;

public class switChcalculator57 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to simple calculator");
        System.out.println("please enter your first number");
        int first = input.nextInt();
        System.out.println("please enter your econd number");
        int second = input.nextInt();
        System.out.println("now enter the opraton: ");
        String opration = input.next();

        int result = switch (opration){
            case "+"  ->first + second;
            case "-"  ->first - second;
            case "*"  ->first * second;
            case "/"  ->first / second;
            case "%"  ->first % second;
            default -> -1;
        };
        System.out.println("your answer is: " + result);
    }
}
