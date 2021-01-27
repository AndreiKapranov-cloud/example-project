package by.example.lecture8.domain;

public abstract class AbstractPet implements Pet {

    protected String name;
    protected int age;
    protected String species;

    public AbstractPet() {
    }

    public AbstractPet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    @Override
    public final void move() {
        System.out.print("I'm " + name + " and I'm moving");
    }

    public final void move(String direction) {
        move();
        System.out.print(" to the " + direction);
    }

}
