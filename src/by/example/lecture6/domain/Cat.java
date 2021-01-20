package by.example.lecture6.domain;

import java.util.Objects;

public class Cat {

    public static final String KIND;

    private String name;
    private String species;
    private int age;
//    private int age = 3;

    static {
        KIND = "Feline";
    }

    public Cat() {
    }

    public Cat(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public Cat(String name, String species) {
        this(name, species, 3); // must be the first line
        this.name = "Changed name";
    }

    public void showInformation() {
        System.out.println("Kind: " + KIND);
        System.out.print("I'm cat with name " + name + ". ");
        System.out.print("I'm cat with species " + species + ". ");
        System.out.println("I'm " + age + " years old!");
    }

    public static void showKind() {
        System.out.println("Kind from static context: " + KIND);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

//    @Override
//    public boolean equals(Object that) {
//        if (this == that) {
//            return true;
//        }
//        if (that == null || getClass() != that.getClass()) {
//            return false;
//        }
//        Cat cat = (Cat) that;
//        return age == cat.age
////                && Objects.equals(name, cat.name)
//                && Objects.equals(species, cat.species);
//    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null || getClass() != that.getClass()) {
            return false;
        }
        Cat cat = (Cat) that;
        if (age != cat.age) {
            System.out.println("age is not equal");
        }
        if (!name.equals(cat.name)) {
            System.out.println("name is not equal");
        }
        if (!species.equals(cat.species)) {
            System.out.println("species is not equal");
        }
        return age == cat.age
//                && Objects.equals(name, cat.name)
                && Objects.equals(species, cat.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, species, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age +
                '}';
    }

}
