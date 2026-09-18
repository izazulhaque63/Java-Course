import java.util.Scanner;

public class passwordcheker59 {
    public static void main(String[] args) {
        Scanner inpput = new Scanner(System.in);
        System.out.println("welcome to set your password");
        String password;
        do {
            System.out.println("please enter your password");
            password = inpput.next();
        }while(!isValidPassword(password));
        System.out.println("thanks for entring a valid password");
    }
    public static boolean isValidPassword(String password){
       return password.length() > 6;
    }
}
