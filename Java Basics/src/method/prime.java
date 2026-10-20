package method;

public class prime {
    public static void main(String[] args) {
        System.out.println(isPrime(11));
    }
    public static boolean isPrime(int num) {
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
