import java.util.Scanner;

public class usingbreak65 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("checking comman using break");
            System.out.println("please enter your command");
            String command = input.next();
            if (command.equalsIgnoreCase( "exit")){
                break;
            }
        }
        System.out.println("you have succsesfully exited");

    }
}
