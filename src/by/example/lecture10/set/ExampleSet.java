package by.example.lecture10.set;

import by.example.lecture10.Model;

import java.util.HashSet;
import java.util.Set;

public class ExampleSet {

    public static void main(String[] args) {

        Set<Model> models = new HashSet<>();
        Model model1 = new Model("model 1");
        models.add(model1);
        models.add(new Model("model 2"));
        models.add(new Model("model 3"));

        models.forEach(System.out::println);

        System.out.println("models.contains(model1) = " + models.contains(model1));
        System.out.println("models.contains(new) = " + models.contains(new Model("new")));

        boolean remove = models.remove(model1);

        System.out.println("models after clear");
        models.clear();
        models.forEach(System.out::println);

    }

}
