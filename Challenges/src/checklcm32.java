import java.util.Scanner;

public class checklcm32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to lcm");
        System.out.println("please enter your first number");
        int first = input.nextInt();
        System.out.println("please enter your second number");
        int second= input.nextInt();
        int lcm = lcm(first,second);
        System.out.println("your lcm is true: " + lcm);
    }
    public static int lcm(int first, int second){
    int i = 1;
    while (i <= second){
        int factor = first * i;
        if (factor % second == 0){
            return factor;
        }
        i++;
    }
        return 0;
    }
}
