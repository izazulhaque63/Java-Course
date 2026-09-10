import java.util.Scanner;

public class arraysearching {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to array searching");
        int  []arr = {3, 4, 5, 6, 7, 8 ,9,10, 11, 12, 13, 14, 15};
        System.out.println("enter the number you want to search ");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if (isFound){
            System.out.println("your number is found in array");
        }else {
            System.out.println("your number was not found in the arraay");
        }
    }
    public static boolean isFound(int [] arr, int num){
        int index = 0;
        while(index < arr.length){
            if (arr[index] == num){
                return true;
            }
            index++;
        }
        return false;
    }
}
