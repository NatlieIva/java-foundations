package ru.itsjava.core.OOP.animals;

public class Animals {

    public static void main(String[] args) {
        Cow cow1 = new Cow();
        Cow cow2 = new Cow();
        Cow cow3 = new Cow();
        Cow cow4 = new Cow();
        Cow cow5 = new Cow();
        System.out.println("Cow1 name: " + cow1.getColor());
        System.out.println("Cow2 name: " + cow2.getColor());
        System.out.println("Cow3 name: " + cow3.getColor());
        System.out.println("Cow4 name: " + cow4.getColor());
        System.out.println("Cow5 name: " + cow5.getColor());


        cow1.setColor("black");
        cow2.setColor("grey");
        cow3.setColor("brown");

        System.out.println("Cow1 name: " + cow1.getColor());
        System.out.println("Cow2 name: " + cow2.getColor());
        System.out.println("Cow3 name: " + cow3.getColor());
        System.out.println("Cow4 name: " + cow4.getColor());
        System.out.println("Cow5 name: " + cow5.getColor());

        cow1.setNameBreed("Abergele");
        cow2.setNameBreed("Belgian Red");
        cow3.setNameBreed("Icelandic");

        System.out.println("Cow1 breed: " + cow1.getNameBreed());
        System.out.println("Cow2 breed: " + cow2.getNameBreed());
        System.out.println("Cow3 breed: " + cow3.getNameBreed());
        System.out.println("Cow4 breed: " + cow4.getNameBreed());
        System.out.println("Cow5 breed: " + cow5.getNameBreed());

        Cat cat = new Cat();
        Cat panther = new Panther();
        cat.sayMeow();
        panther.sayMeow();
    }
}
