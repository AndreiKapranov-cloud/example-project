package by.example.lecture6.app;

import by.example.lecture6.domain.Cat;

public class Application {

    public static void main(String[] args) {

        Cat cat1 = null;
        System.out.println("cat1: " + cat1);

        cat1 = new Cat("Fluffy", "Bengal", 7);
        System.out.println("cat1: " + cat1);
        cat1.setName("Not Fluffy");
        cat1.showInformation();
        System.out.println("hash code: " + cat1.hashCode());

        Cat cat2 = new Cat();
        System.out.println("cat2: " + cat2);
        cat2.showInformation();

        Cat cat3 = new Cat("Snowball", "Bengal");
        cat3.showInformation();

        Cat.showKind();

    }

    public static void printCat(Cat cat) {
        System.out.println("name: " + cat.getName());
        System.out.println("species: " + cat.getSpecies());
//        System.out.println("age: " + cat.getAge());
    }

}
