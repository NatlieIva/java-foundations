package ru.itsjava.core.myarraylist;

public class MyArrayListPractice {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        MyArrayList list2 = new MyArrayList();


        System.out.println(list.size());
        list.add(new Object());
        System.out.println(list.size());

        list.add(new Object());
        list.add(new Object());
        list.add(new Object());
        list.add(new Object());
        list.add(new Object());
        list.add(new Object());
        list.add(new Object());
        list.add(new Object());
        list.add(new Object());
        list.add(new Object());

        System.out.println(list.size());


        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list2.isEmpty() = " + list2.isEmpty());


    }
}
