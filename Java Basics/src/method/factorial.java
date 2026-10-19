package method;

public class factorial {
    public static int product(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact =  fact * i;
            System.out.println("your factorial is: "+ fact);
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println("your final factorial is: ");
        System.out.println(product(4));
    }
}
