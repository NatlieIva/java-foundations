package ru.itsjava.core.annotations;

public class MyJUnitRunner {

    public static void main(String[] args) {

        //1. Создать два счетчика упавших и прошедших тестов
        //2. Создать объект класса MyAmazingTest,
        // и запустить те методы надо которыми стоит аннотация @Test
        //3. Подсчитать сколько тестов упало, а сколько прошло
        //4. Вывести количество упавших и пройденных тестов

        MyAmazingTestLogic myAmazingTestLogic = new MyAmazingTestLogic();
        myAmazingTestLogic.startTesting();
    }
}
