import java.util.Scanner;

public class guessingGame74 {
    int random;

    guessingGame74() {
        random = (int) Math.ceil(Math.random() * 100);

    }

    int guess(int guessNumber) {
        return guessNumber - random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        guessingGame74 game = new guessingGame74();
        System.out.println("welcome to guessing game number: please enter the number between 1 to 100");
        int guess;
        int result;
        do {
            System.out.println("guess the number");
            guess = input.nextInt();
            result = game.guess(guess);
            if (result == 0) {
                System.out.println("congrats you guess the correct number");
            } else if (result < 0) {
                System.out.println("please guess higher");
            } else {
                System.out.println("please guess lower");
            }
        }while (result != 0) ;

    }
}


