package by.example.lecture5.practice;

import java.util.Arrays;
import java.util.Random;

public class Practice_19_18 {
    private static final Random RANDOM = new Random();

    /*
    Заполнить массив положительными случайными
    двузначными числами так,
    чтобы они образовывали неубывающую последовательность
    (каждый элемент не меньше предыдущего).
     */
    public static void main(String[] args) {

        // 1. create array

        int[] array = new int[5];

        // 2. fill array[0]
        array[0] = RANDOM.nextInt(90) + 10;

        // 3. fill array[1] ... array[size-1]
        // array[i] >= array[i-1]

//        for (int i = 1; i < array.length; i++) {
//            array[i] = RANDOM.nextInt(90) + 10;
//            if (array[i - 1] >= array[i]) {
//                i--;
//            }
//        }

        for (int i = 1; i < array.length; i++) {
            while (array[i] == 0) {
                int next = RANDOM.nextInt(90) + 10;
                if (next > array[i - 1]) {
                    array[i] = next;
                }
            }
        }

        // 4. print array
        System.out.println(Arrays.toString(array));

    }

}
