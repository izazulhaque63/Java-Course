package genric;

public class varargument {
    public static void main(String... args) {
        System.out.println(sum(3,6));
        System.out.println(sum(3,6,9));
        System.out.println(sum(3,6,9,6));
    }
    public static int sum(int first, int second , int... a) {
        int sum = first + second;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
