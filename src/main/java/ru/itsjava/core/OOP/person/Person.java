package ru.itsjava.core.OOP.person;

abstract class Person {
    private boolean isMale;
    private String name;
    private int age;

    public Person(boolean isMale, String name, int age) {
        this.isMale = isMale;
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age) {
        this.isMale = isMale;
        this.name = name;
        this.age = age;
    }

    public void printAge() {
        System.out.println(age);
    }

    public boolean getIsMale() {
        return isMale;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

//    public abstract String setName(String name);


}
