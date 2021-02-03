package by.example.lecture10.tasks;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class Task10_1_3 {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Queue<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < 100; i++) {
            int random = RANDOM.nextInt(10) + 1;
            System.out.print(random + " ");
            numbers.add(random);
        }
        System.out.println();

        int numberToFind = RANDOM.nextInt(10) + 1;
        System.out.println(numberToFind);

        for (int i = 0; i < 100; i++) {
            Integer removed = numbers.remove();
            if (removed == numberToFind) {
                System.out.println("user " + (i % 2 + 1) + " is a winner!");
                break;
            }
        }

    }

}
