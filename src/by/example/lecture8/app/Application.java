package by.example.lecture8.app;

import by.example.lecture8.domain.Cat;
import by.example.lecture8.domain.Dog;
import by.example.lecture8.domain.Pet;

public class Application {

    public static void main(String[] args) {

//        Pet pet = new Pet(); // cannot be instantiated

        final Cat cat = new Cat("Fluffy", 3, "bengal", 70);
        cat.tellInfo();
        cat.say();
        cat.printCatInfo();
//        cat = new Cat(); // cannot assign value to final variable

        Pet dog = new Dog("Lassie", 4, "husky", 80);
        dog.tellInfo();
        dog.say();
//        dog.printDogInfo(); // method cannot be resolved
        ((Dog) dog).printDogInfo();

        cat.move();
        System.out.println();
        cat.move("left");
        System.out.println();

    }

}
