package ru.itsjava.core;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, -1, 10, -22, 100, 3000, 0, -3, -1000};

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scan.nextInt();

        System.out.println("Sum of digit: " + getSumDigits(num));

        System.out.print("Number divisors: ");
        printNumberDivisors(num);
        System.out.println();

        printElementByIndex(array, 3, 5);

        System.out.print("Even elements from array : ");
        printEvenElements(array);

        System.out.println();

        System.out.print("Odd elements from array : ");
        printOddElements(array);

        System.out.println();

        System.out.print("First four elements from array: ");
        printFirstFourElements(array);

        System.out.println();

        System.out.print("Last four elements from array: ");
        printLastFourElements(array);

        System.out.println();

        System.out.print("Each third elements from inverse array: ");
        printEachThirdElementsFromInverseArray(array);

        System.out.println();

        System.out.print("Positive elements from inverse array: ");
        printPositiveElementsFromInverseArray(array);

        System.out.println();

        System.out.print("Index zero elements from array: ");
        printIndexZeroElements(array);

        System.out.println();

        System.out.println("Multiplication all elements from array: " + getMultiplicationAll(array));

        System.out.println("The average all elements from array: " + getAverage(array));

        System.out.println("The sum of all even elements from array: " + getSumEvenElements(array));

        System.out.println("Multiplication of all odd elements from array: " + getMultiplicationOddElements(array));

        System.out.println("Min element from array: " + getMinElement(array));

        System.out.println("The sum of all negative elements from array: " + getSumNegativeElements(array));

        System.out.println("The sum of elements multiple of five from array: " + getSumMultipleOfFive(array));

        System.out.println("Two max elements from array: " + Arrays.toString(getTwoMaxElements(array)));

        System.out.println("Get the index of element from array: " + getIndexElement(array, 10));

        printPositiveArray(array);
    }


    public static int getSumDigits(int number) {
        number = Math.abs(number);
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }

    public static void printNumberDivisors(int number) {
        number = Math.abs(number);
        for (int divisor = 1; divisor <= number; divisor++) {
            if ((number % divisor) == 0) {
                System.out.print(divisor + " ");
            }
        }
    }

    public static void printElementByIndex(int[] array, int index1, int index2) {
        System.out.println("Element by number " + (index1 - 1) + ": " + array[index1 - 1]);
        System.out.println("Element by number " + (index2 - 1) + ": " + array[index2 - 1]);
    }

    public static void printEvenElements(int[] array) {
        for (int i = 1; i < array.length; ) {
            System.out.print(array[i] + " ");
            i = i + 2;
        }
    }

    public static void printOddElements(int[] array) {
        for (int i = 0; i < array.length; ) {
            System.out.print(array[i] + " ");
            i = i + 2;
        }
    }

    public static void printFirstFourElements(int[] array) {
        for (int i = 0; i < 4; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void printLastFourElements(int[] array) {
        for (int i = array.length - 1; i > array.length - 5; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void printEachThirdElementsFromInverseArray(int[] array) {
        for (int i = array.length - 3; i >= 0; ) {
            System.out.print(array[i] + " ");
            i = i - 3;
        }
    }

    public static void printPositiveElementsFromInverseArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void printIndexZeroElements(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static int getMultiplicationAll(int[] array) {
        int multiplication = 1;
        for (int value : array) {
            multiplication = multiplication * value;
        }
        return multiplication;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum = sum + value;
        }
        return sum / array.length;
    }

    public static int getSumEvenElements(int[] array) {
        int sum = 0;
        for (int i = 1; i < array.length; ) {
            sum = sum + array[i];
            i = i + 2;
        }
        return sum;
    }

    public static int getMultiplicationOddElements(int[] array) {
        int multiplication = 1;
        for (int i = 0; i < array.length; ) {
            multiplication = multiplication * array[i];
            i = i + 2;
        }
        return multiplication;
    }

    public static int getMinElement(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                min = array[i];
            } else {
                min = array[i + 1];
            }
        }
        return min;
    }

    public static int getSumNegativeElements(int[] array) {
        int sum = 0;
        for (int value : array) {
            if (value < 0) {
                sum = sum + value;
            }
        }
        return sum;
    }

    public static int getSumMultipleOfFive(int[] array) {
        int sum = 0;
        int divisor = 5;
        for (int value : array) {
            if ((value % divisor) == 0) {
                sum = sum + value;
            }
        }
        return sum;
    }

    public static int[] getTwoMaxElements(int[] array) {
        int[] twoMax = new int[2];
        twoMax[0] = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > twoMax[0]) {
                twoMax[1] = twoMax[0];
                twoMax[0] = array[i];
            } else {
                if (array[i] > twoMax[1]){
                    twoMax[1] = array[i];
                }
            }
        }
        return twoMax;
    }

    public static int getIndexElement(int[] array, int element) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index = i;
            }
        }
        return index;
    }

    public static void printPositiveArray(int[] array) {
        int countPositive = 0;
        for (int value : array) {
            if (value > 0) {
                countPositive++;
            }
        }
        if (countPositive >= 3) {
            System.out.println("Array is positive! " + Arrays.toString(array));
        } else {
            System.out.println("Array is negative!");
        }
    }
}



