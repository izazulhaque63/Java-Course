package classandobject.myhostel;

public class hostel {
    int numberOfFlor;
    int numberOfRooms;
    int numberOfStudent;
    String wardenName;
    String hostelName;

    public hostel() {
        System.out.println("hostel is open to 24 hours");
    }
    public void hostelRule(){
        System.out.println("smoking and drinking is not allow in the hostel");
    }
    public void hostelTiming(){
        System.out.println("entry time in hoste is 8pm");
    }
    public void ShowDetails() {
        System.out.println("number of flor is " + numberOfFlor);
        System.out.println("number of rooms is " + numberOfRooms);
        System.out.println("number of student is " + numberOfStudent);
        System.out.println("warden name is " + wardenName);
        System.out.println("hostel name is " + hostelName);
    }
}
