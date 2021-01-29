package by.example.lecture9.nestedclasses;

public class Application {

    public static void main(String[] args) {

        // not allowed because is not an enclosing class
//        OuterClassWithInnerClass.InnerClass innerClass = new OuterClassWithInnerClass.InnerClass();

//        OuterClassWithInnerClass outerClass = new OuterClassWithInnerClass();
//        OuterClassWithInnerClass.InnerClass innerClass = outerClass.new InnerClass();
//        innerClass.printText();

//        OuterClassWithStaticInnerClass.InnerClass innerClass = new OuterClassWithStaticInnerClass.InnerClass();
//        innerClass.printText();
//        OuterClassWithStaticInnerClass.InnerClass.staticPrintText();

//        OuterClassWithLocalMethodClass outerClassWithLocalMethodClass = new OuterClassWithLocalMethodClass();
//        outerClassWithLocalMethodClass.method();

        OuterClassWithAnonymousInnerClass outerClass = new OuterClassWithAnonymousInnerClass();
        outerClass.print();

    }

    public void nonStaticMethod() {
        System.out.println("non static");
    }

}
