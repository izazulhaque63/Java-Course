import java.util.Scanner;

public class challenge19 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("claculating grade based on percentage");
        System.out.println("please enter you percentage");
        int percentage = input.nextInt();
        if (percentage >= 90){
            System.out.println("grade A");
        } else if (percentage >= 75){
            System.out.println("grade B");
        } else if (percentage >= 60){
            System.out.println("grade C");
        }  else if (percentage >= 30){
            System.out.println("grade D");
        } else {
            System.out.println("fail");
        }
    }
}
