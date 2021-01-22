package by.example.lecture7;

public class ExampleStringConcatenation {

    public static void main(String[] args) {

        String str1 = "Hello, ";
        String concatenatedStr = str1.concat("Name!");
        System.out.println("str1 = " + str1);
        System.out.println("concatenatedStr = " + concatenatedStr);

        String joinedStr = String.join(", ", "cat", "dog", "human");
        System.out.println(joinedStr);
        String[] strArray = {"apple", "book", "cat", "dog"};
        String joinedStrFromArray = String.join("-", strArray);
        System.out.println(joinedStrFromArray);

    }

}
