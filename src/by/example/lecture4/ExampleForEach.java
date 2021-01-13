package by.example.lecture4;

public class ExampleForEach {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }

        for (int element : array) {
            System.out.println(element);
        }

    }

}
