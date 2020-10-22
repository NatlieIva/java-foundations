package ru.itsjava.core.interfaces.comparable;

import java.util.Arrays;

public class School {

    public static void main(String[] args) throws CloneNotSupportedException {
        Pen pen1 = new Pen("blue", 0.3, true);
        Pen pen2 = new Pen("red", 0.5, false);
        Pen pen3 = new Pen("black", 0.4, true);

        pen1.clone();
        System.out.println(pen1);

        Pen[] pens = new Pen[]{pen1, pen2, pen3};
        System.out.println(Arrays.toString(pens));
        Arrays.sort(pens);
        System.out.println(Arrays.toString(pens));


    }
}
