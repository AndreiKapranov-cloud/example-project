package by.example.lecture14.streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ExampleRWIOStreams {

    public static final String FILENAME = "resources/file.txt";
    public static final int SIZE = 10;

    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream(FILENAME);
        InputStreamReader reader = new InputStreamReader(in);
        char[] chars = new char[SIZE];
        reader.read(chars);
        System.out.println(new String(chars));
    }

}
