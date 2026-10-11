package polymorphisam;

public class passByValue {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int sum = add(a, b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(sum);
    }
    public static int add(int a, int b) {
        a += b;
        return a;

    }
}
