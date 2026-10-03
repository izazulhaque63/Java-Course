package datatypes;

public class typecasting {
    public static void main(String[] args) {
//        Widening conversion
//        int number = 100;
//        double result = number;
//        System.out.println(result);

       // Narrowing conversion
        double price = 99.75;
        int wholePrice = (int) price;
        System.out.println(wholePrice);

       // Range overflow example
        int number = 130;
        byte small = (byte) number;
        System.out.println(small);
    }
}
