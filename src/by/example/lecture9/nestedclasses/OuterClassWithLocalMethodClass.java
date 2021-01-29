package by.example.lecture9.nestedclasses;

public class OuterClassWithLocalMethodClass {

    public void method() {

        final String message = "message";

        class InnerClass {
            public void printMessage() {
                System.out.println(message);
            }
        }

        InnerClass innerClass = new InnerClass();
        innerClass.printMessage();

    }

}
