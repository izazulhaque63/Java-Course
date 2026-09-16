package classandobject;

public class mobile {
    String brand;
    int price;


    public  void showDetail(){
        System.out.println("your phone brand is: " + brand);
        System.out.println("your phone price is: " + price);
    }

    public static void main(String[] args) {
     mobile mobile = new mobile();
     mobile.brand = "samsung";
     mobile.price = 10000;
    mobile.showDetail();
    }

}

class Mobile {

    String brand = "Samsung";
    static String category = "Smartphone";

    void showDetails() {
        System.out.println(brand);
        System.out.println(category);
    }

    public static void main(String[] args) {

        Mobile mobile = new Mobile();

        mobile.showDetails();
        System.out.println(Mobile.category);
    }
}


