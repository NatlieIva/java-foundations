package ru.itsjava.core.interfaces.types;

public class Main {

    public static void main(String[] args) {

        Man man = new Man();
        man.run();
        man.swim();
        man.walk();
        System.out.println(man.maxRunDistance());
        System.out.println(man.maxSwimSpeed());

        Bird bird = new Bird();
        bird.fly();
        System.out.println(bird.maxDistance());

        Cat cat = new Cat();
        cat.run();
        cat.walk();
        System.out.println(cat.maxRunDistance());

        Dog dog = new Dog();
        dog.run();
        dog.swim();
        dog.walk();
        System.out.println(dog.maxSwimSpeed());
        System.out.println(dog.maxRunDistance());

        Fish fish = new Fish();
        fish.swim();
        System.out.println(fish.maxSwimSpeed());

    }
}
