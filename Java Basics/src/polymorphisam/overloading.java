package polymorphisam;

public class overloading {
    public static void main(String[] args) {
        System.out.println(add(4, 4));
        System.out.println(add(3, 4, 5));

        overloading over = new overloading();
        over.add(5, 5);
        System.out.println(over);


    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public String add(String a, String b) {
        return a + b;

    }

    overloading() {
        System.out.println("overloading");
    }

    overloading(String a, String b) {

    }


}
