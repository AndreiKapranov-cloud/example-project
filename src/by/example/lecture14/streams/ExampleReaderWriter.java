package by.example.lecture14.streams;

import java.io.*;
import java.util.Random;

public class ExampleReaderWriter {

    public static final String FILENAME = "resources/fileForRW.txt";
    public static final char[] CHARS = "text".toCharArray();
    public static final int SIZE = 10;
    public static final char[] RANDOM_CHARS = new char[SIZE];

    public static void main(String[] args) {

        fillRandomCharsArray();

        try (Writer writer = new FileWriter(FILENAME)) {
            writer.write(RANDOM_CHARS);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Reader reader = new FileReader(FILENAME)) {
            char[] chars = new char[SIZE];
            int read = reader.read(chars);
            System.out.println("read: " + read);
            printChars(chars);
            String strFromChars = new String(chars);
            System.out.println(strFromChars);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private static void fillRandomCharsArray() {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            RANDOM_CHARS[i] = (char) (random.nextInt(100) + 32);
        }
    }

    private static void printChars(char[] chars) {
        for (char oneChar : chars) {
            System.out.print(oneChar + " ");
        }
        System.out.println();
    }

}
