package by.example.lecture9.generics;

public class GenericClass<T> {

    private T name;

    public GenericClass(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

}
