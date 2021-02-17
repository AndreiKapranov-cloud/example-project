package by.example.lecture13;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Date;

public class ExampleDates {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime converted = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println(converted);
        System.out.println(converted.plus(5, ChronoUnit.HALF_DAYS));
        System.out.println(converted.plusMinutes(10));
        System.out.println(converted.plusHours(10));

        LocalDate parsedLocalDate = LocalDate.parse("2021-02-17");
        System.out.println(parsedLocalDate);
        LocalDateTime parsedLocalDateTime = LocalDateTime.parse("2021-02-17T12:12:12.78678");
        System.out.println(parsedLocalDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy HH:mm:ss");
        LocalDateTime parsedLocalDateTimeWithFormatter = LocalDateTime.parse("17 февраля 2021 15:20:36", formatter);
        System.out.println(parsedLocalDateTimeWithFormatter);

    }

    private static void showFormat() {
        Date date = new Date();
        System.out.println(date);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss.SSSXXX").format(date));
        System.out.println(new SimpleDateFormat("d").format(date));
        System.out.println(new SimpleDateFormat("dd").format(date));
        System.out.println(new SimpleDateFormat("MMMM").format(date));
        System.out.println(new SimpleDateFormat("MMM").format(date));
        System.out.println(new SimpleDateFormat("MM").format(date));
        System.out.println(new SimpleDateFormat("M").format(date));
        System.out.println(new SimpleDateFormat("yyyy").format(date));
        System.out.println(new SimpleDateFormat("yy").format(date));
        System.out.println(new SimpleDateFormat("y").format(date));
        System.out.println(new SimpleDateFormat("F").format(date));
        System.out.println(new SimpleDateFormat("E").format(date));
        System.out.println(new SimpleDateFormat("EE").format(date));
        System.out.println(new SimpleDateFormat("EEE").format(date));
        System.out.println(new SimpleDateFormat("EEEE").format(date));
        System.out.println(new SimpleDateFormat("EEEEE").format(date));
        System.out.println(new SimpleDateFormat("z").format(date));
        System.out.println(new SimpleDateFormat("zz").format(date));
        System.out.println(new SimpleDateFormat("zzz").format(date));
        System.out.println(new SimpleDateFormat("zzzz").format(date));
        System.out.println(new SimpleDateFormat("X").format(date));
        System.out.println(new SimpleDateFormat("XX").format(date));
        System.out.println(new SimpleDateFormat("XXX").format(date));

        System.out.println(new SimpleDateFormat("d MMMM YYYY HH:mm").format(date));
    }

}
