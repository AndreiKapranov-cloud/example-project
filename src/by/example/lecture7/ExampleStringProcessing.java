package by.example.lecture7;

public class ExampleStringProcessing {

    public static void main(String[] args) {

        String str = "strstrstr";

        String replacedStr = str.replace("tr", "m");
        String replacedChar = str.replace('r', 'm');

        System.out.println("str = " + str);
        System.out.println("replacedStr = " + replacedStr);
        System.out.println("replacedChar = " + replacedChar);

        String substring = str.substring(1, 3); // tr
        System.out.println(substring);
        substring = str.substring(1); // trstrstr
        System.out.println(substring);

        System.out.println(str.toUpperCase());

        String strToTrim = "  sdf   str       ";
        System.out.println(strToTrim);
        System.out.println(strToTrim.trim());

    }

}
