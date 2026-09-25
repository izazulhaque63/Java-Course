package challange81;

public class persontest {
    public static void main() {
      person Person1 = new person("masoom",23);
        person Person2 = new person("masoom",23);

        if (Person1 == Person2){
            System.out.println("correct");
        }else {
            System.out.println("incorrect");
        }
    }
}
