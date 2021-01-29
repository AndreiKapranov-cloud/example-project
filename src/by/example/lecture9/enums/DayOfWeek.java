package by.example.lecture9.enums;

public enum DayOfWeek {

    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true),
    SOME_UNKNOWN_DAY(false, "some unknown day");

    private boolean weekend;
    private String value;

    DayOfWeek(boolean weekend) {
        this.weekend = weekend;
    }

    DayOfWeek(boolean weekend, String value) {
        this.weekend = weekend;
        this.value = value;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public String getValue() {
        return value;
    }

}
