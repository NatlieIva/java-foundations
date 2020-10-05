package ru.itsjava.core.OOP.shape;

public class Square extends Shape {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    @Override
    double getArea() {
        return a * a;
    }

    @Override
    double getPerimeter() {
        return 4 * a;
    }
}
