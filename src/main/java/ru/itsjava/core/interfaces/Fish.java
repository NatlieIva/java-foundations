package ru.itsjava.core.interfaces;

public class Fish implements Swimable {
    final double maxSwimSpeed = 5.0;

    @Override
    public void swim() {
        System.out.println("I am fish and I can swim!");
    }

    @Override
    public double maxSwimSpeed() {
        System.out.print("Fish - max swim speed, km/h: ");
        return maxSwimSpeed;
    }
}
