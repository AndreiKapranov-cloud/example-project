package by.example.lecture10.map;

import by.example.lecture10.Model;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {

    public static void main(String[] args) {

        Map<Model, String> map = new HashMap<>();
        map.put(new Model("model 1"), "model 1");
        map.put(new Model("model 2"), "model 2");
        map.put(new Model("model 3"), "model 3");

        map.forEach((key, value) -> System.out.println(key + ": " + value));

    }

}
