package ru.itsjava.core.OOP.shape;

public class Triangle extends Shape {
    private int sideA;
    private int sideB;
    private int sideC;
    private int height;

    public Triangle(int sideA, int sideB, int sideC, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public int getHeight() {
        return height;
    }

    @Override
    double getArea() {
        return sideC * height / 2;
    }

    @Override
    double getPerimeter() {
        return sideA + sideB + sideC;
    }
}
