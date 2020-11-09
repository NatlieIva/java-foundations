package ru.itsjava.core.collections.list.set;

import lombok.Data;

@Data
public class Fruit {
    private final String name;
    private double weight;

    public Fruit(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
}
