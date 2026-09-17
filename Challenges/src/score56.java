import java.util.Scanner;

public class score56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("giving score based on the student marks");
        System.out.println("please enter your marks");
        int marks = input.nextInt();
        String catagory = marks > 80 ? "high" : (marks > 50 ? "modrate" : "low");
        System.out.println("your catagory is: " + catagory);

    }
}
