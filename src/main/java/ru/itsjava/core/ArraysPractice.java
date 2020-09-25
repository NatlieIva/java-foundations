package ru.itsjava.core;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] array = new int[]{-5, 2, 0, 1};

        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));

        var numbers = new int[]{-5, 2, 0, 1};


        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        var array2 = new char[10];

        System.out.println("Arrays.toString(array2) = " + Arrays.toString(array2));

        char ch = 0;

        System.out.println("ch = " + ch);
    }
}
