package ru.itsjava.core.threads;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("This is my thread");
    }
}
