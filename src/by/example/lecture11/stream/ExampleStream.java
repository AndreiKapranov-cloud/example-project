package by.example.lecture11.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleStream {

    public static void main(String[] args) {

        Model model1 = new Model();
        model1.getStrings().forEach(System.out::println);
        Model model2 = new Model();
        model1.getStrings().forEach(System.out::println);

        System.out.println("COLLECTED");
        List<String> collected = Stream.of(model1, model2)
                .flatMap(model -> model.getStrings().stream())
                .collect(Collectors.toList());
        collected.forEach(System.out::println);

    }

    private static void showOperations() {
        List<String> list = new ArrayList<>();
        list.add("cat");
        list.add("apple");
        list.add("dog");
        list.add("apple");
        list.add("cat");
        list.add("apple");
        list.add("cat");
        list.add("apple");
        list.add("cat");
        list.add("apple");
        list.add("cat");
        list.add("apple");
        list.add("dog");
        list.add("apple");
        list.add("dog");
        list.add("apple");
        list.add("dog");
        list.add("apple");
        list.add("dog");

        List<String> collected = list.stream()
                .distinct()
                .filter(str -> str.length() == 3)
                .limit(1)
                .collect(Collectors.toList());
        collected.forEach(System.out::println);
    }

    private static void showConcat(List<String> list) {
        Stream<String> stream1 = list.stream(); // .. perform some operations
        Stream<String> stream2 = list.stream(); // .. perform some operations

        Stream<String> concatenatedStream = Stream.concat(stream1, stream2);
    }

    private static void showOptional() {
        //        Optional.of(null); // fails with NPE
        Optional<String> stringNullOptional = Optional.ofNullable(null);
        Optional<String> stringOptional = Optional.of("str");

        System.out.println(stringOptional.get());
//        System.out.println(stringNullOptional.get()); // No value present

        System.out.println(stringNullOptional.orElse("default"));
        System.out.println(stringOptional.orElse("default"));

        System.out.println(stringNullOptional.orElseGet(() -> UUID.randomUUID().toString()));
        System.out.println(stringOptional.orElseGet(() -> UUID.randomUUID().toString()));

        System.out.println(stringOptional.orElseThrow(() -> {
            throw new RuntimeException("another exception thrown");
        }));
        System.out.println(stringNullOptional.orElseThrow(() -> {
            throw new RuntimeException("another exception thrown");
        }));
    }

    private static void showFind(List<String> list) {
        Optional<String> any = list.stream().findAny();
        System.out.println(any);
    }


    private static void showCount(List<String> list) {
        System.out.println(list.stream().count());
    }

    private static void showMatch(List<String> list) {
        boolean allMatch = list.stream().allMatch(word -> word.startsWith("a"));
        boolean anyMatch = list.stream().anyMatch(word -> word.startsWith("a"));
        boolean noneMatch = list.stream().noneMatch(word -> word.startsWith("a"));
        System.out.println("allMatch: word -> word.startsWith(\"a\") = " + allMatch);
        System.out.println("anyMatch: word -> word.startsWith(\"a\") = " + anyMatch);
        System.out.println("noneMatch: word -> word.startsWith(\"a\") = " + noneMatch);
        allMatch = list.stream().allMatch(word -> word.length() > 2);
        anyMatch = list.stream().anyMatch(word -> word.length() > 2);
        noneMatch = list.stream().noneMatch(word -> word.length() > 2);
        System.out.println("allMatch: word -> word.length() > 2 = " + allMatch);
        System.out.println("anyMatch: word -> word.length() > 2 = " + anyMatch);
        System.out.println("noneMatch: word -> word.length() > 2 = " + noneMatch);
    }

}
