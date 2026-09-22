public class studentTostring70 {
    String name;
    int age;
    String house;

    public studentTostring70(String name, int age, String house) {
        this.name = name;
        this.age = age;
        this.house = house;
    }

    @Override
    public String toString() {
        return "studentTostring70{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", house='" + house + '\'' +
                '}';
    }
    public static void main(String[] args) {
        studentTostring70 student = new studentTostring70("masoom", 22, "up");
        System.out.println(student);
    }
}
