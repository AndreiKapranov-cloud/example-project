package by.example.lecture5.lecture;

import java.util.Arrays;

public class ExampleArrays {

    public static void main(String[] args) {

        int[] array = new int[10];
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            array[i] = 7;
        }
        printArray(array);

        Arrays.fill(array, 2, 5, 3);
        printArray(array);

        int[] arrayToCompareWith = Arrays.copyOf(array, 10);
        printArray(arrayToCompareWith);
        System.out.println("equals = " + Arrays.equals(array, arrayToCompareWith));
        arrayToCompareWith[0] = 2;
        printArray(arrayToCompareWith);
        System.out.println("equals = " + Arrays.equals(array, arrayToCompareWith));

        Arrays.sort(array);
        printArray(array);

        System.out.println(Arrays.toString(array));

        int[] arrayToFind = {7, 8, 9, 10};
        int index = Arrays.binarySearch(arrayToFind, 9);
        System.out.println("index = " + index);

    }

    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
