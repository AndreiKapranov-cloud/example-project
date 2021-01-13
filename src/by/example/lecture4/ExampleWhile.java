package by.example.lecture4;

public class ExampleWhile {

    public static void main(String[] args) {

//        endless loop
//        boolean condition = true;
//        while (condition) {
//            System.out.println("condition is true");
//
//        }

//        1 iteration
//        boolean condition = true;
//        while (condition) {
//            System.out.println("condition is true");
//            condition = false;
//        }

        // still 1 iteration
//        boolean condition = true;
//        while (condition) {
//            condition = false;
//            System.out.println("condition is true");
//        }


        // will be printed
//        boolean condition = true;
//        while (condition) {
//            System.out.println("condition is true");
//            break;
//        }

        // will not be printed, compilation error
//        boolean condition = true;
//        while (condition) {
//            break;
//            System.out.println("condition is true");
//        }

        // endless loop
//        int counter = 0;
//        while (counter < 10) {
//            System.out.println(counter);
//        }

//        int counter = 0;
//        while (counter < 10) {
//            System.out.println(counter);
//            counter++;
//        }

        int counter = 0;
        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }

    }

}
