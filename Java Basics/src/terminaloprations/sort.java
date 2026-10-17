package terminaloprations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class sort {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 6, 5, 2, 8, 7);
        List<Integer> sortednumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortednumbers);
    }
}
