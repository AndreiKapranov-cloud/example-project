package by.example.lecture10.map;

import by.example.lecture10.Model;

import java.util.Map;
import java.util.TreeMap;

public class ExampleTreeMap {

    public static void main(String[] args) {

        Map<Model, String> map = new TreeMap<>();
        map.put(new Model("model 3"), "model 3");
        map.put(new Model("model 1"), "model 1");
        map.put(new Model("model 2"), "model 2");

        map.forEach((key, value) -> System.out.println(key + ": " + value));

    }

}
