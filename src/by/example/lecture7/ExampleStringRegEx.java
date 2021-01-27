package by.example.lecture7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleStringRegEx {

    public static void main(String[] args) {

        String str = "strrrrrstrsssstr";

        System.out.println(str.replaceAll("s", "1"));
        System.out.println(str.replaceAll("st", "1"));
        System.out.println(str.replaceAll("st", "yhjdftyhdr"));
        System.out.println(str.replaceAll(".{4,}", "!"));
        System.out.println("ttt".replaceAll(".{4,}", "!"));
        System.out.println("gfhj".replaceAll(".{4,}", "!"));
        System.out.println(str.replaceAll("\\w{4,}", "!"));
        System.out.println(str.replaceAll("\\S{4,}", "!"));
        System.out.println(str.replaceAll(".{4,}", "\\s"));

        System.out.println(str.replaceFirst("s", "1"));

        System.out.println("str.matches(\"s\") = " + str.matches("s"));
        System.out.println("str.matches(\".\") = " + str.matches("."));
        System.out.println("str.matches(\".*\") = " + str.matches(".*"));

        str = "c88at67456do565g67467cat";
        String[] split = str.split("\\d{3,}");
        for (String s : split) {
            System.out.println(s);
        }

        // . ! ? ... ?!
        // sentence. sentence?!
        // "sentence", "sentence", ""


        System.out.println("str.matches(\"\\\\d{3,}\") = " + str.matches("\\d{3,}"));

        String regex = ".*\\d{3,}.*";
        System.out.println("str.matches(\".*\\d{3,}.*\") = " + str.matches(regex));

        Pattern pattern = Pattern.compile(regex);
        Pattern.matches(regex, str);

        Matcher matcher = pattern.matcher(str);
        System.out.println("pattern.matcher(str).matches() = " + matcher.matches());


        // +375291234567
        // +375 (29) 123-45-67
        // +375(29)123-45-67
        // +375(29)12-34-567
        // +375 (29) 12-34-567
        System.out.println("PHONE REGEX");
        String phoneRegex = "\\+(375)(25|29|33|44)(\\d{7})";
        System.out.println("+375291234567: " + "+375291234567".matches(phoneRegex));
        System.out.println("+375331234567: " + "+375331234567".matches(phoneRegex));
        System.out.println("+3752912345678: " + "+3752912345678".matches(phoneRegex));
        System.out.println("+37529123456: " + "+37529123456".matches(phoneRegex));
        System.out.println("375331234567: " + "375331234567".matches(phoneRegex));

    }

}
