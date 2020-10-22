package ru.itsjava.core.interfaces.comparable;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Person implements Comparable<Person>, Cloneable {
    private final String firstName;
    private final String secondName;
    private int age;


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        return secondName != null ? secondName.equals(person.secondName) : person.secondName == null;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (int) age;
        return result;
    }


    @Override
    public int compareTo(Person o) {
        if (this == o) return 0;
        int i = secondName.compareTo(o.secondName);
        if (i != 0) return i;
        i = firstName.compareTo(o.firstName);
        if (i != 0) return i;
        return Integer.compare(age, o.age);
    }
}
