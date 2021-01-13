package by.example.lecture4;

public class ExampleFor {

    public static void main(String[] args) {

//        int counter = 0;
//        while (counter < 10) {
//            System.out.println(counter);
//            counter++;
//        }

//        for (int counter = 0; counter < 10; counter++) {
//            System.out.println(counter);
//        }

//        int counter = 0;
//        for (; counter < 10; counter++) {
//            System.out.println(counter);
//        }

//        int counter = 0;
//        for (; counter < 10; ) {
//            System.out.println(counter);
//            counter++;
//        }

//        int counter = 0;
//        for (; ; ) {
//            System.out.println(counter);
//            counter++;
//            if (counter == 10) {
//                break;
//            }
//        }

        for (int i = 0, j = 10; i < 5 && j > 0; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }

    }

}
