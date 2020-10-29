package ru.itsjava.core.myarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {

        // а). Создать пустой список
        List<Person> personsEmptyArray = new ArrayList<>();

        //б). Создать список размером 20
        ArrayList<Person> persons = new ArrayList<>(20);

        // а) Добавить подряд 5 элементов.
        persons.add(new Person("Ann", Sex.FEMALE, 25));
        persons.add(new Person("Max", Sex.MALE, 20));
        persons.add(new Person("Kate", Sex.FEMALE, 48));
        persons.add(new Person("Sam", Sex.MALE, 33));
        persons.add(new Person("Pit", Sex.MALE, 13));

        System.out.println(persons);
        System.out.println("persons.size() = " + persons.size());

        // б) Добавить шестой элемент в третию позицию. Добавить седьмой элемент в первую позицию.
        Person bill = new Person("Bill", Sex.MALE, 50);
        Person matt = new Person("Matt", Sex.MALE, 18);

        persons.add(2, bill);
        persons.add(0, matt);
        System.out.println(persons);
        System.out.println("persons.size() = " + persons.size());

        // в) Записать в новый список все элементы предыдущего списка.
        ArrayList<Person> newPersons = new ArrayList<Person>(persons.size());
        for (int i = 0; i < persons.size(); i++) {
            newPersons.add(i, persons.get(i));
        }
        System.out.println("new persons list: " + newPersons);

        // 1. Получить элемент по индексу:
        // а). Получить первый элемент
        System.out.println("first element = " + persons.get(0));

        // б). Получить последний элемент
        System.out.println("last element = " + persons.get(persons.size() - 1));

        // 3. Задачи на удаление элементов: (Используя методы)
        // а) Удалить элемент по значению

        persons.remove(bill);
        System.out.println(persons);

        // б) Удалить элемент по индексу
        persons.remove(1);
        System.out.println(persons);

        // 4. Проверить наличие элемента
        System.out.println("persons.contains(matt) = " + persons.contains(matt));

        // 5. Вывод списка:
        // а) Вывести список на экран в формате: List: {"First";"Second";"Third"}
        System.out.println("List: :{" + Arrays.asList(persons) + "}");

        // 6. Отфильтровать список вернуть записи по некоторому условию:
        // а) Условие на индекс: Индекс делится на 3

        System.out.println("Индекс делится на 3: ");
        printElementsWithIndexMultiplyOf3(persons);

        // б) Условие на значение: Вернуть количество элементов, которые равны "***"
        Person person1 = new Person("Ann", Sex.FEMALE, 25);
        persons.add(person1);
        persons.add(person1);
        persons.add(person1);
        persons.add(person1);

        System.out.println("Вернуть количество элементов, которые равны \"***\" " + getNumberOfMatches(persons, person1));


        // 7. Пропустить несколько первых элементов
        // а) Пропустить первые 3 элемента в списке.

        System.out.println("persons.subList(3,persons.size() = " + persons.subList(3, persons.size()));

        // 6 + 7: Пропускаем элементы, которые удовлетворяют некоторому условию
        // а) Пропустить первые 2 элемента, которые равные "****"

        int count1 = 0;
        for (Person person : persons
        ) {
            if (person.equals(person1)) {
                count1++;
                if (count1 > 2)
                    System.out.println("number " + count1 + " - " + person);
            }
        }


        // 8. Вернуть первый подходящий элемент:
        // а) Возращаем Первый элемент возраст которого делится на 3.

        printFirstElementWithAgeMultiplyOf3(persons);

        // 9. Возвращаем все элементы удовлетворяющие условию:
        // а) Возвращаем все элементы делятся на 3
        System.out.println("Возраст кратен 3 у следующих: ");
        printAllElementsWithAgeMultiplyOf3(persons);

        // 10. Создать класс Person.
        // Вернуть всех военнообязанных мужчин (пол), которым меньше 27 и больше 18 и имя которых начинается на Н
        System.out.println("все военнообязанные мужчины (пол), которым меньше 27 и больше 18 и имя которых начинается на M");
        for (Person person : persons
        ) {
            if ((person.getSex() == Sex.MALE)
                    && (person.getAge() < 27) && (person.getAge() >= 18)
                    && (person.getName().startsWith("M"))) {
                System.out.println(person);
            }

        }

        // 11. Найти средний возраст всех женщин.
        System.out.println("Женщины: ");
        int sum = 0;
        int count2 = 0;
        for (Person person : persons
        ) {
            if (person.getSex() == Sex.FEMALE) {
                sum = sum + person.getAge();
                count2++;
                System.out.println(person);
            }

        }
        System.out.println("средний возраст всех женщин: " + sum / count2);
    }

    public static void printAllElementsWithAgeMultiplyOf3(ArrayList<Person> persons) {
        for (Person person : persons
        ) {
            if (person.getAge() % 3 == 0) {
                System.out.println(person);
            }

        }
    }

    public static void printFirstElementWithAgeMultiplyOf3(ArrayList<Person> persons) {
        for (Person person : persons
        ) {
            if (person.getAge() % 3 == 0) {
                System.out.println("Первый человек, возраст которого кратен 3: " + person);
                break;
            }

        }
    }

    public static int getNumberOfMatches(ArrayList<Person> persons, Person personToSearch) {
        int count = 0;
        for (Person person : persons
        ) {
            if (person.equals(personToSearch)) {
                count++;
            }
        }
        System.out.println("count = " + count);
        return count;
    }

    public static void printElementsWithIndexMultiplyOf3(ArrayList<Person> persons) {
        for (int i = 3; i < persons.size(); ) {
            System.out.println("index = " + i + " " + persons.get(i));
            i = i + 3;

        }
    }
}
