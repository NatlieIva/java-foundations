package ru.itsjava.core.collections.list.linkedlist;

import java.util.LinkedList;

public class MyLinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

//        list.add("Строка 1");
//        list.add("Строка 2");
//        list.add("Строка 1");
//        list.add("Строка 3");
//        list.add("Строка 1");
//        list.add("Строка 1");
//        list.add("Строка 4");

        list.add("Строка 1");
        list.add("Строка 2");
        list.add("Строка 3");
        list.add("Строка 4");


        System.out.println("list = " + list);

        System.out.println("list.size() = " + list.size());

        System.out.println("list.isEmpty() = " + list.isEmpty());

        list.clear();
        System.out.println("list.isEmpty() after clear() = " + list.isEmpty());

        System.out.println("list.contains(\"Строка 1\") = " + list.contains("Строка 1"));

        System.out.println("list.remove(\"Строка 2\") = " + list.remove("Строка 2"));
        System.out.println("list = " + list);

        System.out.println("list.get(2) = " + list.get(3));

        System.out.println("list.set(1,\"новая строка\") = " + list.set(2, "новая строка"));
        System.out.println("list = " + list);

        list.add(1, "Новая строка");
        System.out.println("list = " + list);

        System.out.println("list.remove(1) = " + list.remove(2));
        System.out.println("list = " + list);

        System.out.println("list.indexOf(\"Строка 3\") = " + list.indexOf("Строка 3"));
        System.out.println("list.indexOf(\"Строка 3\") = " + list.indexOf("Строка 3"));

        System.out.println("list.lastIndexOf(\"Строка 1\") = " + list.lastIndexOf("Строка 1"));

        LinkedList li = new LinkedList();
        li.remove(1);
    }
}
