package classandobject;

public class libarysystem {
    String title = "java basic";
    static String libararyname = "citylibary";


    public static void showDetail(){
       libarysystem libary = new libarysystem();
        System.out.println("your book title is: " + libary.title);
        System.out.println("your libary name is: " + libarysystem.libararyname);
    }
    public static void main(String[] args) {
        libarysystem.showDetail();
    }
}
