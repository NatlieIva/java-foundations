package ru.itsjava.core.interfaces;

public class Dog implements Walkable, Runnable, Swimable {
    final double maxSwimSpeed = 10.0;
    final int maxRunDistance = 150;

    @Override
    public void run() {
        System.out.println("I am dog and I can run!");
    }

    @Override
    public int maxRunDistance() {
        System.out.print("Dog - max run distance, km: ");
        return maxRunDistance;
    }

    @Override
    public void swim() {
        System.out.println("I am dog and I can swim!");
    }

    @Override
    public double maxSwimSpeed() {
        System.out.print("Dog - max swim speed, km/h: ");
        return maxSwimSpeed;
    }

    @Override
    public void walk() {
        System.out.println("I am dog and I can walk!");
    }
}
