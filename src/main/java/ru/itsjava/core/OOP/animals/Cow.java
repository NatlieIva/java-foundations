package ru.itsjava.core.OOP.animals;

public class Cow {
    private String color = "black & white";
    private String nameBreed = "Madura";

    public Cow() {
        this.color = color;
        this.nameBreed = nameBreed;
    }

    public Cow(String color) {
        this.color = color;
        this.nameBreed = nameBreed;
    }

    public Cow(String color, String nameBreed) {
        this.color = color;
        this.nameBreed = nameBreed;
    }


    public String getColor() {
        return this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNameBreed() {
        return this.nameBreed = nameBreed;
    }

    public void setNameBreed(String nameBreed) {
        this.nameBreed = nameBreed;
    }
}

