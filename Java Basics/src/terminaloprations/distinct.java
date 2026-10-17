package terminaloprations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class distinct {
    public static void main(String[] args) {
        List<String> items = List.of("apple", "banana", "orange", "apple", "banana");
        List<String> distinctitems = items.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctitems);
    }
}
