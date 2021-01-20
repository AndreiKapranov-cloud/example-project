package by.example.lecture6.app;

import by.example.lecture6.domain.Cat;

public class ApplicationForEquals {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Fluffy", "Bengal", 3);
        System.out.println("cat1 hashCode: " + cat1.hashCode());
        Cat cat2 = new Cat("Snowball", "Bengal", 3);
        System.out.println("cat2 hashCode: " + cat2.hashCode());

        System.out.println("cat1 == cat2 = " + (cat1 == cat2));

        System.out.println("cat1.equals(cat2) = " + cat1.equals(cat2));

    }

}
