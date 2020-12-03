package ru.itsjava.core.exception;

import ru.itsjava.core.collections.list.arraylist.Person;
import ru.itsjava.core.collections.list.arraylist.Sex;
import ru.itsjava.core.exception.UnderAgeException;

public class ExceptionPractice {
    public static void main(String[] args) {
        Person person = new Person("Bob", Sex.MALE);
        person.setAge(17);

        try {
            person.drinkVodka();
        } catch (UnderAgeException e) {
            try {
                System.err.println("Age should be > 18");
                throw new UnderAgeException();
            } catch (UnderAgeException ex) {
                ex.printStackTrace();
            } finally {
                System.out.println("age < 18");
            }
        } finally {
            System.out.println("hahaha");
        }
    }

}

