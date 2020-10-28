package ru.itsjava.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс Person должен: ")
public class PersonTest {
    public static final String NAME = "Pit";
    public static final int AGE = 25;

    @Test
    @DisplayName("корректно создавать конструктор")
    public void shouldHaveCorrectConstructor() {
        Person person = new Person(NAME, AGE);
        Assertions.assertAll(() -> assertEquals("Pit", person.getName()),
                () -> assertEquals(AGE, person.getAge()));
    }

    @Test
    @DisplayName("корректно увеличивать возраст после дня рождения")
    public void shouldHaveCorrectBirthday() {
        Person person = new Person(NAME, AGE);
        person.birthday();
        assertEquals(AGE + 1, person.getAge());
    }

    @Test
    @DisplayName("отсеивать несовершеннолених")
    public void shouldCorrectIdentifiedMinors() {
        Person person = new Person(NAME, AGE);
        assertEquals(true, person.takeBeer());
    }

}
