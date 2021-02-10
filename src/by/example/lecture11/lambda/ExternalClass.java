package by.example.lecture11.lambda;

public class ExternalClass {

    private static final String LINE = "line";
    private static final int MAX_LENGTH = 7;

    public static void method(Interface interfaceObject) {
        System.out.println("call from external class");
        interfaceObject.method(LINE, MAX_LENGTH);
    }

}
