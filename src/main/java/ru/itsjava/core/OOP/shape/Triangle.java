package ru.itsjava.core.OOP.shape;

public class Triangle extends Shape {
    private int a;
    private int b;
    private int c;
    private int height;

    public Triangle(int a, int b, int c, int height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getHeight() {
        return height;
    }

    @Override
    double getArea() {
        return c * height / 2;
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }
}
