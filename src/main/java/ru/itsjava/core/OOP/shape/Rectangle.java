package ru.itsjava.core.OOP.shape;

public class Rectangle extends Shape {
    private int a;
    private int b;


    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    double getArea() {
        return a * b;
    }

    @Override
    double getPerimeter() {
        return 2 * (a + b);
    }
}
