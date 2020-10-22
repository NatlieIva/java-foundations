package ru.itsjava.core.interfaces.comparable;

import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public class Pen implements Cloneable, Comparable<Pen> {
    private final String color;
    private final double neckThickness;
    private final boolean isHelium;

    @Override
    public int compareTo(Pen o) {
        return Double.compare(neckThickness, o.neckThickness);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pen)) return false;

        Pen pen = (Pen) o;

        if (Double.compare(pen.neckThickness, neckThickness) != 0) return false;
        if (isHelium != pen.isHelium) return false;
        return color != null ? color.equals(pen.color) : pen.color == null;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(neckThickness);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color='" + color + '\'' +
                ", neckTi=" + neckThickness +
                ", isHelium=" + isHelium +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
