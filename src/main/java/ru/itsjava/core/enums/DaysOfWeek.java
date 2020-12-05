package ru.itsjava.core.enums;

public enum DaysOfWeek {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private final String translate;

    DaysOfWeek(String translate) {
        this.translate = translate;
    }

    public String getTranslate() {
        return translate;
    }

    @Override
    public String toString() {
        return this.name() + "(rus. " + translate + ')';
    }
}
