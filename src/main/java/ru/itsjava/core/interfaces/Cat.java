package ru.itsjava.core.interfaces;

public class Cat implements Walkable, Runnable {
    final int maxRunDistance = 150;

    @Override
    public void run() {
        System.out.println("I am cat and I can run!");
    }

    @Override
    public int maxRunDistance() {
        System.out.print("Cat - max run distance, km: ");
        return maxRunDistance;
    }

    @Override
    public void walk() {
        System.out.println("I am cat and I can walk!");
    }
}
