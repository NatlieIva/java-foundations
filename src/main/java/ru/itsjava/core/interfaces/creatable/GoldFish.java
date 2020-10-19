package ru.itsjava.core.interfaces.creatable;

public class GoldFish implements Creatable {
    @Override
    public void createWish() {
        System.out.println("Золотая рыбка создает все красиво");
    }
}
