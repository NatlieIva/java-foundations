package ru.itsjava.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс Person должен: ")
public class PersonTest {

    @Test
    @DisplayName("корректно создавать конструктор")
//    @BeforeEach
    public void shouldHaveCorrectConstructor() {
        Person person = new Person("Pit", 25);

        Assertions.assertAll(() -> assertEquals("Pit", person.getName()),
                () -> assertEquals(25, person.getAge()));
    }

    @Test
    @DisplayName("корректно увеличивать возраст после дня рождения")
    public void shouldHaveCorrectBirthday() {
        Person person = new Person("Pit", 25);
        person.birthday();
        assertEquals(26, person.getAge());
    }

    @Test
    @DisplayName("отсеивать несовершеннолених")
    public void shouldCorrectIdentifiedMinors() {
        Person person = new Person("Pit", 25);
        assertEquals(true, person.takeBeer());
    }

}
