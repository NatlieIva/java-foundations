package ru.itsjava.core;

import java.util.Arrays;
import java.util.Scanner;

public class PaintShop {


    public static void main(String[] args) {

        String[] paints = new String[]{"white", "blue", "yellow", "black", "red", "green", "gray"};
        System.out.println("Добро пожаловать в магазин красок!");

        printMenu();
        Scanner console = new Scanner(System.in);


        while (true) {
            System.out.println("Выберите номер операции");
            int menuNum = console.nextInt();
            if (menuNum == 1) {
                printAll(paints);
            } else if (menuNum == 2) {
                paints = addPaint(console, paints);
            } else if (menuNum == 3) {
                paints = removePaint(console, paints);
            } else if (menuNum == 4) {
                sortPaints(paints, 0, paints.length - 1);
                printAll(paints);
            } else if (menuNum == 0) {
                System.out.println("Всего доброго, до новых встреч!");
                System.exit(0);
            }
        }
    }

    public static void printAll(String[] paints) {
        for (String paint : paints
        ) {
            System.out.print(paint + " ");

        }
        System.out.println();
    }

    public static String[] addPaint(Scanner console, String[] paints) {
        System.out.println("Введите цвет краски для добавления в базу");
        String newPaint = console.next();
        String[] newPaints = Arrays.copyOf(paints, paints.length + 1);
        newPaints[paints.length] = newPaint;
        return newPaints;
    }

    public static String[] removePaint(Scanner console, String[] paints) {
        System.out.println("Введите цвет краски для удаления из базы");
        String removePaint = console.next();
        String[] newPaints = new String[paints.length - 1];
        int delInd;
        for (delInd = 0; delInd < paints.length; delInd++) {
            if (paints[delInd].equals(removePaint)) {
                break;
            }
            newPaints[delInd] = paints[delInd];
        }

        if (newPaints.length - delInd >= 0)
            System.arraycopy(paints, delInd + 1, newPaints, delInd, newPaints.length - delInd);

        return newPaints;
    }

    public static void sortPaints(String[] array, int lowMarker, int highMarker) {
//        if (array.length == 0) {
//            System.out.println("Array is empty");
//        }
//        if (lowMarker >= highMarker) {
//            System.out.println("Incorrect boundaries ");
//        }
        int midInd = lowMarker + (highMarker - lowMarker) / 2;
        String midEl = array[midInd];

        int i = lowMarker;
        int j = highMarker;

        while (i <= j) {
            while (array[i].compareTo(midEl) < 0) {
                i++;
            }
            while (midEl.compareTo(array[j]) < 0) {
                j--;
            }
            if (i <= j) {
                String local = array[i];
                array[i] = array[j];
                array[j] = local;
                i++;
                j--;
            }

            if (lowMarker < j) {
                sortPaints(array, lowMarker, j);
            }
            if (i < highMarker) {
                sortPaints(array, i, highMarker);
            }
        }

    }

    public static void printMenu() {
        System.out.println("Меню:\n" +
                " 1. Вывести все краски\n" +
                " 2. Добавить краску в базу\n" +
                " 3. Удалить краску из базы\n" +
                " 4. Отсортировать краски по алфавиту\n" +
                " 0. Выход");

    }

}

