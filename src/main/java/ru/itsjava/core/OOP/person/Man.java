package ru.itsjava.core.OOP.person;

import lombok.AllArgsConstructor;


public class Man extends Person {
    final boolean isMale;


    public Man(String name, int age) {
        super(name, age);
        this.isMale = true;
    }

    public boolean getIsMale() {
        return isMale;
    }
}
