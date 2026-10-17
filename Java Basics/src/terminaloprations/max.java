package terminaloprations;

import java.util.List;
import java.util.Optional;

public class max {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> max = list.stream()
                .max(Integer::compareTo);
        max.ifPresent(System.out::println);
    }
}
