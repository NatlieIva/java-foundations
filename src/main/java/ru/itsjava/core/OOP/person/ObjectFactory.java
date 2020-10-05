package ru.itsjava.core.OOP.person;

public class ObjectFactory {

    public static void main(String[] args) {

        Person man1 = new Man("Andy", 30);
        Person man2 = new Man("Bob", 21);
        Person man3 = new Man("Sam", 15);
        man1.printAge();
        Person woman1 = new Woman("Ann", 35);
        Person woman2 = new Woman("Margo", 20);
        woman1.printAge();
        System.out.println(man1.getIsMale());
        System.out.println(woman1.getIsMale());

        Person[] persons = new Person[]{man1, man2, man2, woman1, woman2};

        for (Person person : persons
        ) {
            System.out.print(person.getName() + "'s age - ");
            person.printAge();

        }
    }


}
