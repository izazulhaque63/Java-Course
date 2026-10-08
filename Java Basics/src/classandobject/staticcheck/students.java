package classandobject.staticcheck;

public class students {
    String name;
    int age;
    static String collegeName; //= "iec co

    public void  showDetails() {
        System.out.println("your name is :" + name);
        System.out.println("your age is :" + age);
//        students.collegeName = "iec";
        System.out.println("your college name is :" + collegeName);

    }  public static void stdentName(){
        System.out.println("komal");
    }
    public static void main(String[] args) {
        students s1 = new students();
        s1.name="Jack";
        s1.age=18;
        students.collegeName="iec college";
        s1.showDetails();

        students s2 = new students();
        s2.name="Jacob";
        s2.age=19;
        //students.collegeName="iec college";
        s2.showDetails();
        //System.out.println("your college name is :" + students.collegeName);

        students.stdentName();
    }
}
