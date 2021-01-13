package by.example.lecture3;

public class ExampleBitOperators {

    public static void main(String[] args) {

        int a = 17;
        int b = 21;
        int c = -17;

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));

        System.out.println("~a = " + ~a); // bitwise negation
        System.out.println("~b = " + ~b); // bitwise negation

        System.out.println(Integer.toBinaryString(~a));
        System.out.println(Integer.toBinaryString(~b));

        System.out.println("a & b = " + (a & b)); // bitwise multiplication
        System.out.println("a | b = " + (a | b)); // bitwise addition
        System.out.println("a ^ b = " + (a ^ b)); // bitwise exclusive addition

        System.out.println("a >> 0 = " + (a >> 0)); // bitwise right shift
        System.out.println("a >> 1 = " + (a >> 1));
        System.out.println("a >> 2 = " + (a >> 2));
        System.out.println("a >> 3 = " + (a >> 3));
        System.out.println("a >> 4 = " + (a >> 4));
        System.out.println("a >> 5 = " + (a >> 5));

        System.out.println("a << 0 = " + (a << 0)); // bitwise left shift
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a << 2 = " + (a << 2));
        System.out.println("a << 3 = " + (a << 3));
        System.out.println("a << 4 = " + (a << 4));
        System.out.println("a << 5 = " + (a << 5));
        System.out.println("a << 31 = " + (a << 31));
        System.out.println("a << 32 = " + (a << 32));
        System.out.println("a << 33 = " + (a << 33));

        // bitwise right shift with 0 padding
        System.out.println("c >>> 0 = " + (c >>> 0));
        System.out.println("c >>> 1 = " + (c >>> 1));
        System.out.println("c >>> 2 = " + (c >>> 2));
        System.out.println("c >>> 3 = " + (c >>> 3));
        System.out.println("c >>> 4 = " + (c >>> 4));
        System.out.println("c >>> 5 = " + (c >>> 5));
        System.out.println("c >>> 31 = " + (c >>> 31));
        System.out.println("c >>> 32 = " + (c >>> 32));
        System.out.println("c >>> 33 = " + (c >>> 33));

    }

}
