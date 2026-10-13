package collection;

import java.util.HashSet;
import java.util.Set;

public class setinterface {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("pandey");
        names.add("aadii");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("pandey"));
        System.out.println(names.contains("aadii"));
        System.out.println(names.remove("pandey"));
        System.out.println(names);
        System.out.println(names.remove("pandey"));

    }
}
