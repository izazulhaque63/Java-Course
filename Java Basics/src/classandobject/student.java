package classandobject;

public class student {
    String Name;
    int Age;

    public void showDetail(){
        System.out.println("name: "+ Name);
        System.out.println("age: " + Age);
    }
    public static void main(String[] args) {
        student student1 = new student();
       student1.Name = "rahul";
       student1.Age = 23;



       student student2 = new student();
       student2.Name ="komal";
       student2.Age = 25;

       student1.showDetail();
       student2.showDetail();
    }
}
