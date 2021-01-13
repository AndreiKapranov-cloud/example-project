package by.example.lecture4;

import java.util.Random;

public class ExampleArray {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

//        int a = 1;
//
//        int[] array = {a, 1, 9, 2, 9};
//
//        array[0]++;
//
//        System.out.println("variable: " + a);
//        System.out.println("in array: " + array[0]);

//        int[] array = new int[10];
//        for (int i = 0; i < 10; i++) {
//            System.out.println("before: array[i] = " + array[i]);
//            array[i] = RANDOM.nextInt(10);
//            System.out.println("after: array[i] = " + array[i]);
//        }
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//
//        for (int element : array) {
//            System.out.print(element + " ");
//        }
//
//        // doesn't work
//        for (int element : array) {
//            element = RANDOM.nextInt(10);
//        }
//
//        System.out.println();
//        for (int element : array) {
//            System.out.print(element + " ");
//        }

//        int[] array = new int[]{7, 2};
//
//        for (int element : array) {
//            System.out.print(element + " ");
//        }

//        int count = 5;
//        int[] array = new int[count];

        int[] array = {7, 3, 2};
        int[] copy = array.clone();

        System.out.println("initial array:");
        for (int element : array) {
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.println("copied array:");
        for (int element : copy) {
            System.out.print(element + " ");
        }

        // java.lang.ArrayIndexOutOfBoundsException
//        for (int i = 0; i < 4; i++) {
//            System.out.println(array[i]);
//        }

        // java.lang.ArrayIndexOutOfBoundsException
//        System.out.println(array[-3]);


    }

}
