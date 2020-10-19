package ru.itsjava.core.interfaces.creatable;

public class Gin implements Creatable {
    @Override
    public void createWish() {
        System.out.println("Джин создает все некрасиво");

    }

    @Override
    public void printWish(String wish) {
        System.out.println("Я пишу твое желание на песке - " + wish);

    }
}
