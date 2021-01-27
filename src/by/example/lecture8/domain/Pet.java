package by.example.lecture8.domain;

public interface Pet {

    void say(); // method is overridden in inherited classed

    void move(); // method is overridden in abstract class

    default void tellInfo() {
        System.out.println("I'm a pet!");
    }

}
