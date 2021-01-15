package by.example.lecture5.practice;

import java.util.Random;

public class Practice_22_19 {

    private static final Random RANDOM = new Random();

    /*
    Вычислить сумму значений в левой диагонали массива.
    Можно исходить из предположения,
    что массив имеет одинаковое количество строк и столбцов.
     */
    public static void main(String[] args) {

        // 1. create array
        int size = 5;
        int[][] array = new int[size][size];

        // 2. fill array with random values
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = RANDOM.nextInt(10);
            }
        }
        for (int[] row : array) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        // 3. calculate left diagonal
        int diagonal = 0;
        for (int i = 0; i < size; i++) {
            diagonal += array[i][i];
        }

        // 4. print diagonal
        System.out.println("diagonal = " + diagonal);

    }

}
