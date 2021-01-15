package by.example.lecture5.practice;

import java.util.Random;

public class Practice_11_8 {

    private static final Random RANDOM = new Random();

    private static final int MIN_BOUND = -20;
    private static final int MAX_BOUND = 35;

    public static void main(String[] args) {

        // 1. create array
        int[] array = new int[15];

        // 2. fill with random values form -20 to 35
        for (int i = 0; i < 15; i++) {
            array[i] = RANDOM.nextInt(MAX_BOUND - MIN_BOUND + 1) + MIN_BOUND;
        }

        // 3. print with '?' mark after negative number
//        for (int element : array) {
//            System.out.print(element);
//            if (element < 0) {
//                System.out.print("?");
//            }
//            System.out.print(" ");
//        }
//
//        for (int element : array) {
//            String value = element < 0 ? element + "? " : element + " ";
//            System.out.print(value);
//        }

        for (int element : array) {
            System.out.print(element + (element < 0 ? "? " : " "));
        }

    }
}
