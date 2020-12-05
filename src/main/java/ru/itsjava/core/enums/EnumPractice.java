package ru.itsjava.core.enums;

public class EnumPractice {
    public static void main(String[] args) {
        System.out.println(DaysOfWeek.valueOf("SUNDAY"));
        DaysOfWeek monday = DaysOfWeek.MONDAY;
        System.out.println(monday.getTranslate());
    }
}
