package classandobject.constructor;

public class student {
    String name;
    int age;


    student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void showDetail() {
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
    }
    public static void main(String[] args) {
        student s1 = new student("Sam", 18);
        s1.showDetail();
        student s2 = new student("juliet", 20);
        s2.showDetail();
    }
}
