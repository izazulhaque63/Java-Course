package classandobject.school;

public class checkdetails {
    public static void main(String[] args) {
        classrooms c1 = new classrooms();
        c1.totalStudents = 45;
        c1.ClassTeachersName = "sharadha";
        c1.schoolName = "st.theresers";
//        System.out.println("Total students: " + c1.totalStudents);
//        System.out.println("Class teachers: " + c1.ClassTeachersName);
//        System.out.println("School name: " + c1.schoolName);
//

        classrooms c2 = new classrooms();
        c2.totalStudents = 30;
        c2.ClassTeachersName = "pooja";
        c2.schoolName = "st.theresers";
//        System.out.println("Total students: " + c2.totalStudents);
//        System.out.println("Class teachers: " + c2.ClassTeachersName);

        c1.schoolDetails();
        c1.schoolDetails();
        c1.schoolDetails();
    }

}
