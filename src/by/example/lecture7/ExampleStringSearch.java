package by.example.lecture7;

public class ExampleStringSearch {

    public static void main(String[] args) {

        String str = "strstrstr";
        System.out.println("index of 'r': " + str.indexOf('r')); // 2
        System.out.println("index of 'trs': " + str.indexOf("trs")); // 1
        System.out.println("last index of 'r': " + str.lastIndexOf('r')); // 8

        System.out.println("str.startsWith(\"str\") = " + str.startsWith("str"));
        System.out.println("str.startsWith(\"jgyuk\") = " + str.startsWith("jgyuk"));
        System.out.println("str.endsWith(\"tr\") = " + str.endsWith("tr"));
        System.out.println("str.endsWith(\"jgyuk\") = " + str.endsWith("jgyuk"));

        System.out.println("regionMatches = " + str.regionMatches(1, "tr", 0, 2));
        System.out.println("regionMatches = " + str.regionMatches(2, "tr", 0, 2));

    }

}
