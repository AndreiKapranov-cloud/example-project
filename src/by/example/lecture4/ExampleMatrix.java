package by.example.lecture4;

public class ExampleMatrix {

    public static void main(String[] args) {

        int[][] array = {
                {7, 3},
                {9},
                {1, 7, 6, 9}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] innerArray : array) {
            for (int element : innerArray) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }

}
