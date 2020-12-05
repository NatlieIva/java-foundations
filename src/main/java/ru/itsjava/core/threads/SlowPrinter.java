package ru.itsjava.core.threads;

import lombok.SneakyThrows;

public class SlowPrinter extends Thread {

    private String message;
    private final long delay = 5000L;
    private int repeat;

    public SlowPrinter(String message, int repeat) {
        this.message = message;
        this.repeat = repeat;
    }

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < repeat; i++) {
            Thread.sleep(delay);
            System.out.println(message);
        }
    }
}
