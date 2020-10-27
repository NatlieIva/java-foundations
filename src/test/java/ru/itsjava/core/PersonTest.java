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
    Person person = new Person(NAME, AGE);

    @Test
    @DisplayName("корректно создавать конструктор")
    public void shouldHaveCorrectConstructor() {
        Assertions.assertAll(() -> assertEquals("Pit", person.getName()),
                () -> assertEquals(AGE, person.getAge()));
    }

    @Test
    @DisplayName("корректно увеличивать возраст после дня рождения")
    public void shouldHaveCorrectBirthday() {
        person.birthday();
        assertEquals(26, person.getAge());
    }

    @Test
    @DisplayName("отсеивать несовершеннолених")
    public void shouldCorrectIdentifiedMinors() {
        assertEquals(true, person.takeBeer());
    }

}
