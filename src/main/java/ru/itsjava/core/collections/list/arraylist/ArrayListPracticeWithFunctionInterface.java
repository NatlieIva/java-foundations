package ru.itsjava.core.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayListPracticeWithFunctionInterface {
    public static void main(String[] args) throws NotCorrectAgeException {

        ArrayList<Person> persons = new ArrayList<>(20);

        persons.add(new Person("Ann", Sex.FEMALE, 25));
        persons.add(new Person("Max", Sex.MALE, 20));
        persons.add(new Person("Kate", Sex.FEMALE, 48));
        persons.add(new Person("Sam", Sex.MALE, 33));
        persons.add(new Person("Pit", Sex.MALE, 13));

        Person bill = new Person("Bill", Sex.MALE, 50);
        Person matt = new Person("Matt", Sex.MALE, 18);
        persons.add(bill);
        persons.add(matt);

//_____________________________________________________________________________________
        // в) Записать в новый список все элементы предыдущего списка.
        ArrayList<Person> newPersons = new ArrayList<Person>(persons.size());
//        новый лист размера предыдущего
        IntStream.range(0, persons.size())
//                Поток Int в диапазоне от 0 до размера листа?
                .forEachOrdered(i -> newPersons.add(i, persons.get(i)));
//        добавляем i-ый объект старого листа в новый
        System.out.println("new persons list: " + newPersons);
//_____________________________________________________________________________________
        // б). Получить последний элемент
//        System.out.println("last element = " + persons.get(persons.size() - 1));
        Person lastPerson = getLastPerson(persons);
        System.out.println("lastPerson = " + lastPerson);
//_____________________________________________________________________________________
//        // 3. Задачи на удаление элементов: (Используя методы) НЕ РАБОТАЕТ
//        // а) Удалить элемент по значению

//        persons.stream()
//                .forEachOrdered(person -> persons.remove(bill));
//        System.out.println("After remove bill " + persons);
//_____________________________________________________________________________________
        // 4. Проверить наличие элемента                        НЕ РАБОТАЕТ
//        System.out.println("Проверить наличие элемента ");
//        System.out.println(persons.stream()
//                .filter(person -> persons.equals(matt)));

//_____________________________________________________________________________________

// 5. Вывод списка:
//        // а) Вывести список на экран в формате: List: {"First";"Second";"Third"}
        System.out.println("Вывести список на экран в формате: List: {\"First\";\"Second\";\"Third\"}");
        printAsList(persons);
//_____________________________________________________________________________________
        // 7. Пропустить несколько первых элементов
//        // а) Пропустить первые 3 элемента в списке.
        System.out.println("Пропустить первые 3 элемента в списке");
        skip3elements(persons);
//_____________________________________________________________________________________
        // 6 + 7: Пропускаем элементы, которые удовлетворяют некоторому условию
//        // а) Пропустить первые 2 элемента, которые равные "****"         НЕ РАБОТАЕТ

        Person person1 = new Person("Ann", Sex.FEMALE, 25);
        persons.add(person1);
        persons.add(person1);
        persons.add(person1);
        persons.add(person1);
        persons.add(person1);
        System.out.println("ППропустить первые 2 элемента, которые равные Ann (5-2=3)");
        skip2elementsEqualsEnter(persons, person1);

//_____________________________________________________________________________________
        // 8. Вернуть первый подходящий элемент:
        // а) Возращаем Первый элемент возраст которого делится на 3.
        System.out.println("Возращаем Первый элемент возраст которого делится на 3");
        printFirstElementWithAgeMultiplyOf3(persons);
//_____________________________________________________________________________________
        // 9. Возвращаем все элементы удовлетворяющие условию:
//        // а) Возвращаем все элементы делятся на 3
        System.out.println("Возраст кратен 3 у следующих: ");
        printAllElementsWithAgeMultiplyOf3(persons);


    }

    public static Person getLastPerson(ArrayList<Person> persons) {
        long count = persons.stream().count();
//        запомнили размер листа
        return persons.stream()
                //                прокрутили до предпоследнего элемента
                .skip(count - 1)
                //                выбрали первый (последний) оставшийся
                .findFirst()
                .get();
    }

    public static void printAsList(ArrayList<Person> persons) {
        persons.stream()
                .map(person -> Arrays.asList(person) + " ")
                .forEach(System.out::println);
    }

    public static void skip3elements(ArrayList<Person> persons) {
        persons.stream()
                .skip(persons.size() - 4)
                .forEach(System.out::println);
    }

    //    НЕ РАБОТАЕТ
    public static void skip2elementsEqualsEnter(ArrayList<Person> persons, Person person1) {
        long count = persons.stream()
                .filter(person -> person.equals(person1))
                .count();
        persons.stream()
                .skip(count - 1)
                .forEach(System.out::println);
    }

    public static void printFirstElementWithAgeMultiplyOf3(ArrayList<Person> persons) {
        Person personFirst = persons.stream()
                .filter(person -> person.getAge() % 3 == 0)
                .findFirst()
                .get();
        System.out.println(personFirst);
    }

    public static void printAllElementsWithAgeMultiplyOf3(ArrayList<Person> persons) {

        persons.stream()
                .filter(person -> person.getAge() % 3 == 0)
                .forEach(System.out::println);

    }

}
