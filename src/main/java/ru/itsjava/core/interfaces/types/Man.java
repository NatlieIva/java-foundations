package ru.itsjava.core.interfaces.types;

public class Man implements Walkable, Swimable, Runnable {

    final double maxSwimSpeed = 5.5;
    final int maxRunDistance = 120;

    @Override
    public void run() {
        System.out.println("I am man and I can run!");
    }

    @Override
    public int maxRunDistance() {
        System.out.print("Man - max run distance, km: ");
        return maxRunDistance;
    }

    @Override
    public void swim() {
        System.out.println("I am man and I can swim!");
    }

    @Override
    public double maxSwimSpeed() {
        System.out.print("Man - max swim speed, km/h: ");
        return maxSwimSpeed;
    }

    @Override
    public void walk() {
        System.out.println("I am man and I can walk!");
    }
}
