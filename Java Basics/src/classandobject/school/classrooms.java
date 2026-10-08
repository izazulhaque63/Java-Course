package classandobject.school;

public class classrooms {
    int totalClassRooms;
    int totalStudents;
    int totalTeachers;
    String principalName;
   String directorNmae;
   String schoolName;
   String ClassTeachersName;


   public void schoolDetails() {
       System.out.println("school name: " + schoolName);
       System.out.println("principal Name : " + principalName);
       System.out.println("director Name : " + directorNmae);
    }
    public void studentDetails() {
       System.out.println("toal student : " + totalStudents);
       System.out.println("total teacher : " + totalTeachers);
        System.out.println("principal Name : " + principalName);
    }
    public void teacherDetails() {
       System.out.println("total teacher : " + totalTeachers);
    }
    public void classDetails() {
       System.out.println("total class : " + totalClassRooms);
    }
}
