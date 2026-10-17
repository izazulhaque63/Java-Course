package terminaloprations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class collectors {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h");
        List<String> collectedwords = words.stream()
                .collect(Collectors.toList());
        System.out.println(collectedwords);
    }
}
