package ru.itsjava.core.threads;

import lombok.SneakyThrows;

import java.util.Scanner;

public class ThreadPractice {
    @SneakyThrows
    public static void main(String[] args) {

        MyThread myThread = new MyThread();

        MyRunnable myRunnable = new MyRunnable();
        Thread myThreadWithRunnable = new Thread(myRunnable);

        myThread.start();
        myThreadWithRunnable.start();

        Scanner console = new Scanner(System.in);
        System.out.println("Enter your message");
        String message = console.next();
        System.out.println("Enter number of repetitions");
        int repeat = console.nextInt();

        SlowPrinter slowPrint = new SlowPrinter(message, repeat);
        slowPrint.start();
        slowPrint.join();

    }


}
