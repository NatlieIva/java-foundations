package ru.itsjava.core.OOP.person;

public class Man extends Person {
    private boolean isMale;

    public Man(String name, int age) {
        super(name, age);
        this.isMale = true;
    }

    public boolean getIsMale() {
        return isMale;
    }
}
