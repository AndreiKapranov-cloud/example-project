package by.example.lecture10.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task10_1_2 {

    public static void main(String[] args) {

        List<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String str = "";

        while (!str.equals("stop")) {
            str = scanner.next();
            values.add(str);
        }

        values.remove("stop");

        values.forEach(System.out::println);

    }

}
