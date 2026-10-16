package functionalprograming;


import java.util.List;
import java.util.function.Consumer;


public class filter {
    public static void main(String[] args) {
        List <String> fruits = List.of("apple","banana","cherry","date","g","h");
        System.out.println(fruits.size());
        System.out.println("printing fruits normal");
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        System.out.println("printing fruits using streams");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.println(fruit);
            }
        });

        System.out.println("printing fruits using filter");
        fruits.stream()
                .filter(fruit -> fruit.endsWith("e"))
                .forEach(fruit -> System.out.println(fruit));
    }
}
