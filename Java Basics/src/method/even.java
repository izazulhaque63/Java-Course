package method;

public class even {
    public static int Even(int num) {
        if (num % 2 == 0) {
            System.out.println("your number is even");
        }else  {
            System.out.println("your number is not even");
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(Even(11));
    }
}
