package ru.itsjava.core.OOP.shape;

public class Rectangle extends Shape {
    private int sideA;
    private int sideB;


    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    @Override
    double getArea() {
        return sideA * sideB;
    }

    @Override
    double getPerimeter() {
        return 2 * (sideA + sideB);
    }
}
