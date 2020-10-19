package ru.itsjava.core.interfaces.creatable;

public class OurWorld {
    public static void main(String[] args) {
        Creatable gin = new Gin();
        Person person = new Person(new GoldFish());
        person.wantSomething("Хочу корыто");
//        gin.printWish("Корыто");
    }
}
