package by.example.lecture9.generics;

public class Application {

    public static void main(String[] args) {

        GenericClass<String> genericClass1 = new GenericClass<>("name");

        Name name = new Name("Name");
        GenericClass<Name> genericClass2 = new GenericClass<>(name);

        StringGenericClass stringGenericClass = new StringGenericClass("name");

        UsualClass usualClass = new UsualClass();
        usualClass.method("param");
        usualClass.method(17);
        usualClass.method(17.54);

    }

}
