package by.example.lecture9.nestedclasses;

public class OuterClassWithInnerClass {

    private static String staticText = "staticText";
    private String text = "text";

//    not allowed
//    public void printInnerText() {
//        System.out.println(innerText);
//    }

    public class InnerClass {

        //        Inner classes cannot have static declarations
//        public static String staticInnerText = "innerText";
        public String innerText = "innerText";

        public void printText() {
            System.out.println(staticText);
            System.out.println(text);
        }

//        not allowed
//        public static void staticPrintText() {
//            System.out.println(staticText);
//            System.out.println(text);
//        }

    }

}
