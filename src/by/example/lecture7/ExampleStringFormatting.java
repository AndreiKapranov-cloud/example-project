package by.example.lecture7;

import java.util.Date;

public class ExampleStringFormatting {

    public static void main(String[] args) {

        String template = "Today is %s, %s %d";

        System.out.println(String.format(template, "Friday", "January", 22));
        System.out.println(String.format(template, "Monday", "January", 25));
        System.out.println(String.format(template, "Sunday", "January", 24));

        Date date = new Date();
        String dateTemplate = "Today is %tA, %tB %td, %tT";
        String formattedLine = String.format(dateTemplate, date, date, date, date);
        System.out.println(formattedLine);

    }

}
