package by.example.lecture3;

public class ExampleArithmeticalOperators {

    public static void main(String[] args) {

        int a = 17;
        int b = 21;

        int sum = a + b; // 38
        System.out.println(a + " + " + b + " = " + sum);
//        sum = sum + a; // 55
        sum += a; // 38 + 17 = 55
        System.out.println("sum = " + sum);

        int difference = a - b;
        System.out.println(a + " - " + b + " = " + difference);

        int multiplication = a * b;
        System.out.println(a + " * " + b + " = " + multiplication);

        int division = a / b;
        System.out.println(a + " / " + b + " = " + division); // 0

        double doubleDivision = a * 1.0 / b;
        System.out.println(a + " / " + b + " = " + doubleDivision); // 0.8095238095238095

        doubleDivision = (double) a / b;
        System.out.println(a + " / " + b + " = " + doubleDivision); // 0.8095238095238095

        doubleDivision = (double) (a / b);
        System.out.println(a + " / " + b + " = " + doubleDivision); // 0.0

        int modulo = a % b;
        System.out.println(a + " % " + b + " = " + modulo); // 17

        modulo = b % a;
        System.out.println(b + " % " + a + " = " + modulo); // 4

        System.out.println("POSTFIX");
        int c = 0;
        System.out.println("a = " + a); // 17
        System.out.println("c = " + c); // 0
        c = a++;
        System.out.println("a = " + a); // 18
        System.out.println("c = " + c); // 17

        System.out.println("PREFIX");
        a = 17;
        c = 0;
        System.out.println("a = " + a); // 17
        System.out.println("c = " + c); // 0
        c = ++a;
        System.out.println("a = " + a); // 18
        System.out.println("c = " + c); // 18

    }

}
