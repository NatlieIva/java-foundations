package ru.itsjava.core.interfaces.comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("Brandon", "Flowers", 35);
        Person person2 = new Person("Matt", "Heafy", 25);
        Person person3 = new Person("Brandon", "Flowers", 30);
        Person person4 = new Person("Jen", "Aniston", 40);
        Person person5 = new Person("Drandon", "Flowers", 35);

        Person person6 = (Person) person1.clone();
        System.out.println("person6 = " + person6);

        Person[] persons = new Person[]{person1, person2, person3, person4, person5};
        System.out.println(Arrays.toString(persons));

        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));
    }
}
