import java.util.Scanner;

public class challange20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("cataegrise age based on age age group");
        System.out.println("please enter your age");
        int age = input.nextInt();
        if (age >= 60){
            System.out.println("you are a senior citizen");
        } else if (age >= 20){
            System.out.println("you are adult");
        } else if (age >= 13){
            System.out.println("teenager");
        }  else {
            System.out.println("child");
        }
    }
}
