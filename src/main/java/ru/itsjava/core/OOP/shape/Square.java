package ru.itsjava.core.OOP.shape;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Square extends Shape {
    private int sideA;

//    public Square(int sideA) {
//        this.sideA = sideA;
//    }
//
//    public int getSideA() {
//        return sideA;
//    }

    @Override
    double getArea() {
        return sideA * sideA;
    }

    @Override
    double getPerimeter() {
        return 4 * sideA;
    }
}
