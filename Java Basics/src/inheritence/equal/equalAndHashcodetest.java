package inheritence.equal;

public class equalAndHashcodetest {
    public static void main(String[] args) {
        person Person1 = new person("izazul",23,"0123");
        person Person2 = new person("izazul",22,"0123");
//
//        if (Person1 == Person2){
//            System.out.println("equal");
//        }else {
//            System.out.println("not equals");
//        }

//
//        using.equals

        if (Person1.equals(Person2)){
            System.out.println("equal");
        }else {
            System.out.println("not equals");
        }


    }
}
