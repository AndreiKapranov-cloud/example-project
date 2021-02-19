package by.example.lecture14.streams;

import java.io.*;
import java.util.Random;

public class ExampleStreams {

    //    public static final String FILENAME = "D:\\code\\file.txt";
    public static final String FILENAME = "resources/file.txt";
    public static final byte[] BYTES = "text".getBytes();
    public static final int SIZE = 10;
    public static final byte[] RANDOM_BYTES = new byte[SIZE];

    public static void main(String[] args) {

        fillRandomBytesArray();

        // try-catch
//        OutputStream fileOutputStream = null;
//        try {
//            fileOutputStream = new FileOutputStream(FILENAME);
//            fileOutputStream.write(BYTES);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (fileOutputStream != null) {
//                    fileOutputStream.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        // try-with-resources

        try (OutputStream fileOutputStream = new FileOutputStream(FILENAME)) {
            fileOutputStream.write(RANDOM_BYTES);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStream fileInputStream = new FileInputStream(FILENAME)) {
            byte[] bytes = fileInputStream.readAllBytes();
            printBytes(bytes);
            String strFromBytes = new String(bytes);
            System.out.println(strFromBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void fillRandomBytesArray() {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            RANDOM_BYTES[i] = (byte) (random.nextInt(100) + 32);
        }
    }

    private static void printBytes(byte[] bytes) {
        for (byte oneByte : bytes) {
            System.out.print(oneByte + " ");
        }
        System.out.println();
    }

}
