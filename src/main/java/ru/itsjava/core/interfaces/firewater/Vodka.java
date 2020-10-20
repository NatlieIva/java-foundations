package ru.itsjava.core.interfaces.firewater;

public class Vodka {
    private double temperature;
    private int volume;
    private String producingCountry;
    private String name;

    public Vodka(double temperature, int volume, String producingCountry, String name) {
        this.temperature = temperature;
        this.volume = volume;
        this.producingCountry = producingCountry;
        this.name = name;
    }

    public Vodka(double temperature, int volume) {
        this.temperature = temperature;
        this.volume = volume;
    }

    void drinkTooMuch(String name, int volume) {
        if (volume > 1) {
            System.out.println(name + " - good taste, but too much  - " + volume + " l");
        } else {
            System.out.println("You can drink more");
        }
    }

    void drinkTooMuch(int volume) {
        if (volume > 1) {
            System.out.println("Stop, please! ");
        } else {
            System.out.println("Ok, but alcohol is not healthy");
        }

    }

    ;
}
