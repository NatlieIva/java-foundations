package ru.itsjava.core.collections.list.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Set<Fruit> fruitSet = new HashSet<>();

        Fruit banana = new Fruit("Banana", 150.0);
        Fruit apple = new Fruit("Apple", 200.0);
        Fruit peach = new Fruit("Peach", 250.0);
        Fruit apricot = new Fruit("Apricot", 100.0);

        fruitSet.add(apple);
        fruitSet.add(peach);
        fruitSet.add(apricot);

        fruitSet.add(banana);
        fruitSet.add(banana);


        System.out.println("fruitSet = " + fruitSet);

        fruitSet.remove(banana);

        System.out.println("fruitSet = " + fruitSet);

        System.out.println("fruitSet.contains(banana) = " + fruitSet.contains(banana));
        System.out.println("fruitSet.contains(apple) = " + fruitSet.contains(apple));

        Iterator<Fruit> iterator = fruitSet.iterator();
        while (iterator.hasNext()) {
            Fruit fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}
