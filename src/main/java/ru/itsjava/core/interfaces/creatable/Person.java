package ru.itsjava.core.interfaces.creatable;

public class Person {
    private final Creatable creatable;

    public Person(Creatable creatable) {
        this.creatable = creatable;
    }

    public void wantSomething(String wish) {
        creatable.createWish();
    }
}
