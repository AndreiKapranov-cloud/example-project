package by.example.lecture9.generics;

public class UsualClass {

    public <T> void method(T param) {
        if (param instanceof String) {
            System.out.print("string: ");
        }
        if (param instanceof Integer) {
            System.out.print("integer: ");
        }
        System.out.print(param);
        System.out.println();
    }

}
