package terminaloprations;

import java.util.List;
import java.util.stream.Collectors;

public class uppercase {
    public static void main(String[] args) {
        List<String> word = List.of("apple", "banana", "orange", "apple", "banana");
        List<String> uppercaseword = word.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(uppercaseword);
    }
}
