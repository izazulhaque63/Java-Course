package classandobject.myhostel;

public class hostelmain {
    public static void main(String[] args) {
        hostel h = new hostel();
        h.numberOfFlor = 3;
        h.numberOfRooms = 100;
        h.numberOfStudent = 200;
        h.wardenName = "nempal";
        h.hostelName = "iec hostel";
        h.hostelTiming();
        h.hostelRule();
        h.ShowDetails();


    }
}
