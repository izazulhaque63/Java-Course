package polymorphisam.overriding;

public class overtest {
    public static void main(String[] args) {
        animal animal = new animal();
        dog dog = new dog();
//        cat cat = new cat();
        animal.voice();
        dog.voice();
//        cat.voice();
    }
}
