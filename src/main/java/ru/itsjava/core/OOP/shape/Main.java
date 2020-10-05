package ru.itsjava.core.OOP.shape;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 5);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Triangle triangle = new Triangle(2, 2, 4, 3);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());

        Square square = new Square(4);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());


    }
}
