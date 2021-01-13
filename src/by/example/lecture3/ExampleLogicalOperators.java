package by.example.lecture3;

public class ExampleLogicalOperators {

    public static void main(String[] args) {

        boolean booleanTrue = true;
        boolean booleanFalse = false;

        // logical AND
        System.out.println("booleanTrue && booleanFalse = " + (booleanTrue && booleanFalse)); // false
        System.out.println("booleanTrue && booleanTrue = " + (booleanTrue && booleanTrue)); // true
        System.out.println("booleanFalse && booleanFalse = " + (booleanFalse && booleanFalse)); // true
        System.out.println("booleanTrue && true = " + (booleanTrue && true)); // true
        System.out.println("booleanTrue && false = " + (booleanTrue && false)); // false
        System.out.println("booleanFalse && true = " + (booleanFalse && true)); // false
        System.out.println("booleanFalse && false = " + (booleanFalse && false)); // false

        // logical OR
        System.out.println("booleanTrue || booleanFalse = " + (booleanTrue || booleanFalse)); // true
        System.out.println("booleanTrue || booleanTrue = " + (booleanTrue || booleanTrue)); // true
        System.out.println("booleanFalse || booleanFalse = " + (booleanFalse || booleanFalse)); // false
        System.out.println("booleanTrue || true = " + (booleanTrue || true)); // true
        System.out.println("booleanTrue || false = " + (booleanTrue || false)); // true
        System.out.println("booleanFalse || true = " + (booleanFalse || true)); // true
        System.out.println("booleanFalse || false = " + (booleanFalse || false)); // false

        // logical NOT
        System.out.println("!booleanTrue = " + !booleanTrue); // false
        System.out.println("!booleanFalse = " + !booleanFalse); // true


    }

}
