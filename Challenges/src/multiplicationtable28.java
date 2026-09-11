import java.util.Scanner;

public class multiplicationtable28 {
    public static void main(String[] args) {
        System.out.println("welcome to multiplication table");
        multiplicationtablee();
    }
    public static void multiplicationtablee(){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number");
        int number = input.nextInt();
        int i = 1;
        while (i <= 10){
            System.out.println(number + "x" + i + "=" + (number * i ));
            i++;
        }
    }
}
