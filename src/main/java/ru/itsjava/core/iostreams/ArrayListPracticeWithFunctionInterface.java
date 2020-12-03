package ru.itsjava.core.iostreams;

import org.w3c.dom.ls.LSOutput;
import ru.itsjava.core.collections.list.arraylist.Person;
import ru.itsjava.core.collections.list.arraylist.Sex;
import ru.itsjava.core.exception.NotCorrectAgeException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayListPracticeWithFunctionInterface {
    public static void main(String[] args) throws NotCorrectAgeException {

        ArrayList<Person> persons = new ArrayList<>(20);

        persons.add(new Person("Ann", Sex.FEMALE, 15));
        persons.add(new Person("Max", Sex.MALE, 20));
        persons.add(new Person("Kate", Sex.FEMALE, 17));
        persons.add(new Person("Anton", Sex.MALE, 33));
        persons.add(new Person("Pit", Sex.MALE, 13));

        Person bill = new Person("Bill", Sex.MALE, 50);
        Person matt = new Person("Matt", Sex.MALE, 18);
        persons.add(bill);
        persons.add(matt);

//_____________________________________________________________________________________
        // в) Записать в новый список все элементы предыдущего списка.
        System.out.println("_____________________________________________________________________________________");
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
        System.out.println("_____________________________________________________________________________________");
        System.out.println("lastPerson = " + lastPerson);

//_____________________________________________________________________________________
        // 4. Проверить наличие элемента
        System.out.println("_____________________________________________________________________________________");
        System.out.println("Проверить наличие элемента ");
        System.out.println(persons.stream()
                .anyMatch(person -> person.equals(matt)));

//_____________________________________________________________________________________

// 5. Вывод списка:
//        // а) Вывести список на экран в формате: List: {"First";"Second";"Third"}
        System.out.println("_____________________________________________________________________________________");
        System.out.println("Вывести список на экран в формате: List: {\"First\";\"Second\";\"Third\"}");
        printAsList(persons);
//_____________________________________________________________________________________
        // 7. Пропустить несколько первых элементов
//        // а) Пропустить первые 3 элемента в списке.
        System.out.println("_____________________________________________________________________________________");
        System.out.println("Пропустить первые 3 элемента в списке");
        skip3elements(persons);
//_____________________________________________________________________________________
        // 6 + 7: Пропускаем элементы, которые удовлетворяют некоторому условию
//        // а) Пропустить первые 2 элемента, которые равные "****"

        Person person1 = new Person("Ann", Sex.FEMALE, 25);
        persons.add(person1);
        persons.add(person1);
        persons.add(person1);
        persons.add(person1);
        persons.add(person1);
        System.out.println(persons);
        System.out.println("_____________________________________________________________________________________");
        System.out.println("ППропустить первые 2 элемента, которые равные Ann");
        skip2elementsEqualsEnter(persons, person1);

//_____________________________________________________________________________________
        // 8. Вернуть первый подходящий элемент:
        // а) Возращаем Первый элемент возраст которого делится на 3.
        System.out.println("_____________________________________________________________________________________");
        System.out.println("Возращаем Первый элемент возраст которого делится на 3");
        printFirstElementWithAgeMultiplyOf3(persons);
//_____________________________________________________________________________________
        // 9. Возвращаем все элементы удовлетворяющие условию:
//        // а) Возвращаем все элементы делятся на 3
        System.out.println("_____________________________________________________________________________________");
        System.out.println("Возраст кратен 3 у следующих: ");
        printAllElementsWithAgeMultiplyOf3(persons);


//_____________________________________________________________________________________
        // 1. Найти всех женщин с возрастом меньше 18 и для них вывести (несовершенолетние)
        System.out.println("_____________________________________________________________________________________");
        System.out.println("1. Найти всех женщин с возрастом меньше 18 и для них вывести (несовершенолетние)");
        persons.stream()
                .filter(person ->
                        (person.getSex() == Sex.FEMALE && person.getAge() < 18))
                .map(person -> person + " несовершеннолетние")
                .collect(Collectors.toList())
                .forEach(System.out::println);

//_____________________________________________________________________________________
        // 2. Найти всех мужчин с возрастом > 21 и для них вывести (алкоголь можна)
        System.out.println("_____________________________________________________________________________________");
        System.out.println("2. Найти всех мужчин с возрастом > 21 и для них вывести (алкоголь можна)");
        persons.stream()
                .filter(person ->
                        (person.getSex() == Sex.MALE && person.getAge() >= 21))
                .map(person -> person + " алкоголь можна")
                .collect(Collectors.toList())
                .forEach(System.out::println);

//_____________________________________________________________________________________
        // 3. Найти всех мужчин у которых имя начинается на A и всех Анн
        System.out.println("_____________________________________________________________________________________");
        System.out.println("3. Найти всех мужчин у которых имя начинается на A и всех Анн");
        persons.stream()
                .filter(person ->
                        (person.getSex() == Sex.MALE && person.getName().startsWith("A") ||
                                person.getName().equals("Ann")))
                .forEach(System.out::println);

//_____________________________________________________________________________________
        // 4. Найти количество Ань
        System.out.println("_____________________________________________________________________________________");
        System.out.println("4. Найти количество Ань");
        System.out.println(persons.stream()
                .filter(person ->
                        (person.getName().equals("Ann")))
                .count());

//_____________________________________________________________________________________
        // 5. Вернуть список всех женщин
        System.out.println("_____________________________________________________________________________________");
        System.out.println("5. Вернуть список всех женщин");
        List<Person> women = persons.stream()
                .filter(person ->
                        (person.getSex() == Sex.FEMALE))
                .collect(Collectors.toList());
        System.out.println(women);
//____________________________________________________________________________________
        // 6. Проверить наличие Марата
        System.out.println("_____________________________________________________________________________________");
        System.out.println("6. Проверить наличие Марата");
        persons.stream()
                .anyMatch(person -> person.getName().equals("Marat"));

//____________________________________________________________________________________
        // 7. Найти первую Аню в списке
        System.out.println("_____________________________________________________________________________________");
        System.out.println("7. Найти первую Аню в списке");
        System.out.println(persons.stream()
                .filter(person -> person.getName().equals("Ann"))
                .findFirst()
                .get());

//____________________________________________________________________________________
        // 8. Вернуть список возрастов
        System.out.println("_____________________________________________________________________________________");
        System.out.println("8. Вернуть список возрастов");
        List<Integer> ageList = persons.stream()
                .map(person -> person.getAge())
                .collect(Collectors.toList());
        System.out.println(ageList);

//____________________________________________________________________________________
        // 9. Найти первых трех мужчин в списке
        System.out.println("_____________________________________________________________________________________");
        System.out.println("9. Найти первых трех мужчин в списке");
        final int[] countArr = {0};
        persons.stream()
                .filter(person -> person.getSex() == Sex.MALE && countArr[0]++ < 3)
                .forEach(System.out::println);

//____________________________________________________________________________________
        // // 10. Отсортировать (по имени) и вернуть различных person
        //// возраст которых от 15 до 37 и вывести их всех через пробел
        System.out.println("_____________________________________________________________________________________");
        System.out.println("10. Отсортировать (по имени) и вернуть различных person, " +
                "возраст которых от 15 до 37 и вывести их всех через пробел ");
        Collection<Person> personList = persons.stream()
                .filter(person -> person.getAge() < 37 && person.getAge() > 15)
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).collect(Collectors.toList());
        System.out.println(personList + " ");
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

    public static void skip2elementsEqualsEnter(ArrayList<Person> persons, Person person1) {
        final int[] countArr = {0};
        persons.stream()
                .filter(person -> {
                    if (!person.equals(person1)) return true;
                    return !(countArr[0]++ < 2);
                })
                .forEach(System.out::print);
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
