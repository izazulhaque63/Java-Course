package mapinterface;

import java.util.HashMap;
import java.util.Map;

public class maptesting {
    public static void main(String[] args) {
        Map<String, Integer> Map = new HashMap<>();
        Map.put("A", 1);
        Map.put("B", 2);
        Map.put("C", 3);
        Map.remove("A");
        System.out.println("Map size: " + Map.size());
        System.out.println(Map.get("A"));
        System.out.println(Map.containsKey("B"));
        System.out.println(Map.containsValue("C"));
        System.out.println(Map.remove("A"));
        System.out.println("Map size: " + Map.size());

        for(String key : Map.keySet()) {
            System.out.println(key + ": " + Map.get(key));
        }
    }
}
