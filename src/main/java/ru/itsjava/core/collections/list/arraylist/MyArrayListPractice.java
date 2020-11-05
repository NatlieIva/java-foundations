package ru.itsjava.core.collections.list.arraylist;

public class MyArrayListPractice {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        MyArrayList list2 = new MyArrayList();


//        System.out.println(list.size());
//        list.add(new Object());
//        System.out.println(list.size());

        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add("str4");
        list.add("str5");
        list.add("str6");
        list.add("str7");
        list.add("str8");
        list.add("str9");
        list.add("str10");
        list.add("str11");
        list.add("str12");
        list.add("str13");

        System.out.println(list.size());


        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list2.isEmpty() = " + list2.isEmpty());

//        list.clear();
//        System.out.println("list.isEmpty() = " + list.isEmpty());

        list.remove("str13");
        list.remove("str1");

        System.out.println(list.size());
        System.out.println(list.toString());

        System.out.println("list.contains(\"str14\") = " + list.contains("str14"));

        list.add(5, "InsertStr");
        System.out.println(list.toString());

        System.out.println(list.remove(5));
        System.out.println(list.toString());

        System.out.println(list.remove("str2"));
        System.out.println(list.toString());

        System.out.println("list.indexOf() = " + list.indexOf("str5"));

        list.add(0, "findMe");
        list.add(1, "findMe");
        list.add(8, "findMe");

        System.out.println(list.toString());
//
        System.out.println("list.lastIndexOf(\"findMe\") = " + list.lastIndexOf("findMe"));

        System.out.println("list.get(5) = " + list.get(0));
        list.set(1, "setStr");
        System.out.println(list.toString());
    }
}
