import java.util.Scanner;

public class digitcount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to dogit count");
        System.out.println("please enter the number");
        int num = input.nextInt();
        int count = 0;
        while(num > 0){
        num = num / 10;
        count = count + 1;
        }
        System.out.println("total digit:" + count);
    }
}
