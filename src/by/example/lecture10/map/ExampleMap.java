package by.example.lecture10.map;

import java.util.HashMap;
import java.util.Map;

public class ExampleMap {

    public static void main(String[] args) {

        Map<Integer, String> daysOfWeek = new HashMap<>();
        daysOfWeek.put(1, "monday");
        daysOfWeek.put(2, "tuesday");
        daysOfWeek.put(3, "wednesday");
        daysOfWeek.put(4, null);

        System.out.println(daysOfWeek.get(1));

        daysOfWeek.forEach((key, value) -> System.out.println(key + ": " + value));

        printMap(daysOfWeek);

        System.out.println("daysOfWeek.containsKey(1) = " + daysOfWeek.containsKey(1));
        System.out.println("daysOfWeek.containsKey(10) = " + daysOfWeek.containsKey(10));

        daysOfWeek.computeIfPresent(1, (key, value) -> value.toUpperCase());
        daysOfWeek.computeIfPresent(4, (key, value) -> value.toUpperCase());
        printMap(daysOfWeek);

        daysOfWeek.computeIfAbsent(1, key -> "monday"); // similar
        daysOfWeek.putIfAbsent(1, "monday"); // methods (in this case)
        daysOfWeek.computeIfAbsent(4, key -> "thursday");
        printMap(daysOfWeek);

        String removed = daysOfWeek.remove(1);
        System.out.println("removed value: " + removed);
        printMap(daysOfWeek);

        daysOfWeek.replace(2, "replaced tuesday");
        printMap(daysOfWeek);
        daysOfWeek.replace(2, "tuesday", "REPLACED TUESDAY");
        printMap(daysOfWeek);
        daysOfWeek.replace(2, "replaced tuesday", "REPLACED TUESDAY");
        printMap(daysOfWeek);

        daysOfWeek.clear();
        System.out.println("map after clear");
        printMap(daysOfWeek);
    }

    private static void printMap(Map<Integer, String> daysOfWeek) {
        for (Integer key : daysOfWeek.keySet()) {
            System.out.println(key + ": " + daysOfWeek.get(key));
        }
    }

}
