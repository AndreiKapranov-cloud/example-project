package by.example.lecture3;

public class ExampleTernaryOperator {

    public static void main(String[] args) {

        // condition ? true : false
        int a = (5 > 7) ? 17 : 21; // 21
        System.out.println("a = " + a);
        int b = (5 < 7) ? (14 + 3) : 21; // 17
        System.out.println("b = " + b);
        String str = (5 > 7) ? "yes" : "no";
        System.out.println(str); // no

    }

}
