package terminaloprations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class min {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Optional<Integer> max = list.stream()
                .min(Integer::compareTo);
        max.ifPresent(System.out::println);
    }
}
