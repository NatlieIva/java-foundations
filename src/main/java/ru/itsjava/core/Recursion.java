package ru.itsjava.core;

import java.util.Arrays;

public class Recursion {

    public static void main(String[] args) {
//        System.out.println(getFactorial(5));
//        printArray(4);
//        System.out.println(getFibonacciNumbers(6));

        int[] array = new int[]{3, 5, 1, 0, 6, 8, 2};
        int lowMarker = 0;
        int highMarker = array.length - 1;
        System.out.println(Arrays.toString(quickSort(array, lowMarker, highMarker)));
    }

    public static int getFactorial(int num) {
        int factorial = 1;
        int count = 1;
        while (count <= num) {
            factorial = factorial * count;
            count++;
        }
        return factorial;
    }

    public static void printArray(int n) {
        if (n < 1) {
            return;
        } else {
            printArray(n - 1);
            System.out.print(" " + n);
        }
    }

    public static int getFibonacciNumbers(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return getFibonacciNumbers(n - 1) + getFibonacciNumbers(n - 2);

        }
    }

    public static int[] quickSort(int[] array, int lowMarker, int highMarker) {
        if (array.length == 0) {
            System.out.println("Array is empty");
            return array;
        }
        if (lowMarker >= highMarker) {
            System.out.println("Incorrect boundaries ");
            return array;
        }
        int midInd = lowMarker + (highMarker - lowMarker) / 2;
        int midEl = array[midInd];

        int i = lowMarker;
        int j = highMarker;

        while (i <= j) {
            while (array[i] < midEl) {
                i++;
            }
            while (midEl < array[j]) {
                j--;
            }
            if (i <= j) {
                int local = array[i];
                array[i] = array[j];
                array[j] = local;
                i++;
                j--;
            }

            if (lowMarker < j) {
                quickSort(array, lowMarker, j);
            }
            if (i < highMarker) {
                quickSort(array, i, highMarker);
            }
        }

        return array;
    }
}
