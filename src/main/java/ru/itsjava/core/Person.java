package ru.itsjava.core;

import lombok.Data;

@Data
public class Person {
    private final String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void birthday() {
        this.age++;
    }

    public boolean takeBeer() {
        if (this.age >= 18) return true;
        return false;
    }

}
