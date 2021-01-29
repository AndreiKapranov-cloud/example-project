package by.example.lecture9.enums;

public class Application {

    public static void main(String[] args) {

        System.out.println(DayOfWeek.MONDAY);

        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            System.out.println(dayOfWeek);
        }

        System.out.println(DayOfWeek.FRIDAY.ordinal());

        System.out.println(DayOfWeek.valueOf("FRIDAY"));
//        System.out.println(DayOfWeek.valueOf("ghfdghs"));

        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            if (dayOfWeek.name().equals("FRIDAY")) {
                System.out.println(dayOfWeek + " is almost weekend!");
            }
            if (dayOfWeek.isWeekend()) {
                System.out.println(dayOfWeek + " is weekend!");
            }
        }

        System.out.println(DayOfWeek.SOME_UNKNOWN_DAY.name());
        System.out.println(DayOfWeek.SOME_UNKNOWN_DAY.getValue());

    }

}
