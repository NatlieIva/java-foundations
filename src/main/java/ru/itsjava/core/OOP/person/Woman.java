package ru.itsjava.core.OOP.person;

public class Woman extends Person {
    final boolean isMale;

    public Woman(String name, int age) {
        super(name, age);
        this.isMale = false;
    }

    public boolean getIsMale() {
        return isMale;
    }

    public void printAge() {
        System.out.println("Forever 18");
    }
}
