package ru.itsjava.core.interfaces.types;

public class Bird implements Flyable {
    final String maxDistance = "1000";

    @Override
    public void fly() {
        System.out.println("I am bird and I can fly!");
    }

    @Override
    public String maxDistance() {
        System.out.print("Bird - max distance, km: ");
        return maxDistance;
    }
}
