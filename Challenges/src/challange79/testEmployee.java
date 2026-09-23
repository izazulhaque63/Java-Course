package challange79;

public class testEmployee {
    public static void main(String[] args) {
        employee emp = new employee("masoom",23,2000);
        System.out.println(emp.getemployeeDetails());
        emp.setName("izazul");
        System.out.println(emp.getemployeeDetails());
    }
}
