package ru.itsjava.core;

public class Recursion {

    public static void main(String[] args) {
        System.out.println(getFactorial(5));
        printArray(4);
        System.out.println(getFibonacciNumbers(6));
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
}
