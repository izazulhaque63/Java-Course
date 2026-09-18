import java.util.Scanner;

public class recursionpelindrom69 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to printing palindrome checker");
        System.out.println("please enter the string to be printed");
        String str = input.next();
        System.out.println("your string is " + ((ispalindrome(str) ? "palindrome": "not palindrome")));
    }
    public static boolean ispalindrome(String str){
        if (str.length() <= 1){
            return true;
        }
        int lastpos = str.length() - 1;
        if (str.charAt(0) == str.charAt(lastpos)){
            return false;
        }
        String newStr = str.substring(1,lastpos);
     return ispalindrome(newStr);
    }
}
