package classandobject;

public class phone {
    String brand;
    String model;
    String color;
    int price;

    public void call()
    {
        System.out.println( brand + "calling");
    }
    public void showdetails()
    {
        System.out.println("brand : "+brand);
        System.out.println("model : "+model );
        System.out.println( "color : "+color );
        System.out.println( "price : "+price );

    }
    public static void main(String[] args) {
        phone p = new phone();
//        p.call();
//        p.showdetails();
        p.color = "red";
        p.price = 100;
        p.color = "green";
        p.brand = "samsung";
        p.model = "a14";

        p.call();
      p.showdetails();
    }
}
