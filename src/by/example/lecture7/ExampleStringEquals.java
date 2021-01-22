package by.example.lecture7;

public class ExampleStringEquals {

    public static void main(String[] args) {

        String exampleString = "Hello!";
        String anotherExampleString = "Hello!";

        System.out.println("exampleString hashCode: " + exampleString.hashCode());
        System.out.println("anotherExampleString hashCode: " + anotherExampleString.hashCode());

        System.out.println("== : " + (exampleString == anotherExampleString));
        System.out.println("equals : " + exampleString.equals(anotherExampleString));

        String oneMoreExampleString = new String(exampleString);

        System.out.println("== : " + (exampleString == oneMoreExampleString));
        System.out.println("equals : " + exampleString.equals(oneMoreExampleString));

        String str1 = "strING"; // I = 73
        String str2 = "string"; // i = 105
        System.out.println("equals: " + str1.equals(str2));
        System.out.println("equalsIgnoreCase: " + str1.equalsIgnoreCase(str2));

        System.out.println("str1.compareTo(str2) = " + str1.compareTo(str2)); // -32
        System.out.println("str2.compareTo(str1) = " + str2.compareTo(str1)); // 32

        System.out.println("str1.compareToIgnoreCase(str2) = " + str1.compareToIgnoreCase(str2)); // 0


    }

}
