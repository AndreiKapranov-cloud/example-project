package by.example.lecture9.nestedclasses;

public class OuterClassWithStaticInnerClass {

    private static String staticText = "staticText";
    private String text = "text";

//    not allowed
//    public void printInnerText() {
//        System.out.println(staticInnerText);
//        System.out.println(innerText);
//    }

    public static class InnerClass {

        public static String staticInnerText = "innerText";
        public String innerText = "innerText";

//        Non-static field 'text' cannot be referenced from a static context
//        public void printText() {
//            System.out.println(staticText);
//            System.out.println(text);
//        }
//
//        public static void staticPrintText() {
//            System.out.println(staticText);
//            System.out.println(text);
//        }

        public void printText() {
            System.out.println("printText: " + staticText);
        }

        public static void staticPrintText() {
            System.out.println("staticPrintText: " + staticText);
        }

    }

}
