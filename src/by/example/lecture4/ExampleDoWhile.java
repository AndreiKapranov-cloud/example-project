package by.example.lecture4;

public class ExampleDoWhile {

    public static void main(String[] args) {

//        endless loop
//        boolean condition = true;
//        do {
//            System.out.println("condition is true");
//        } while (condition);

//        1 iteration
//        boolean condition = false;
//        do {
//            System.out.println("condition is true");
//        } while (condition);

        // will be printed
//        boolean condition = false;
//        do {
//            System.out.println("condition is true");
//            break;
//        } while (condition);

        // will not be printed, compilation error
//        boolean condition = false;
//        do {
//            break;
//            System.out.println("condition is true");
//        } while (condition);

        // endless loop
//        int counter = 0;
//        do {
//            System.out.println(counter);
//        } while (counter < 10);

//        int counter = 0;
//        do {
//            System.out.println(counter);
//            counter++;
//        } while (counter < 10);

//        int counter = 0;
//        do {
//            counter++;
//            if (counter == 5) {
//                continue;
//            }
//            System.out.println(counter);
//        } while (counter < 10);

        // endless loop
//        int counter = 0;
//        do {
//            System.out.println(counter);
//            if (counter == 5) {
//                continue;
//            }
//            counter++;
//        } while (counter < 10);

//        int counter = 0;
//        do {
//            counter++;
//            if (counter == 5) {
//                break;
//            }
//            System.out.println(counter);
//        } while (counter < 10);

        int counter = 0;
        do {
            System.out.println(counter);
            counter++;
        } while (counter <= 10);

    }

}
