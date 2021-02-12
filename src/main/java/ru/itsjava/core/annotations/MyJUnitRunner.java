package ru.itsjava.core.annotations;

import java.lang.reflect.Method;

public class MyJUnitRunner {

    public static void main(String[] args) {

        //1. Создать два счетчика упавших и прошедших тестов
        //2. Создать объект класса MyAmazingTest,
        // и запустить те методы надо которыми стоит аннотация @Test
        //3. Подсчитать сколько тестов упало, а сколько прошло
        //4. Вывести количество упавших и пройденных тестов

        int passedTests = 0;
        int failedTests = 0;

        MyAmazingTest myAmazingTest = new MyAmazingTest();
        Method[] declaredMethodsMyAmazingTest = MyAmazingTest.class.getDeclaredMethods();

        for (Method method : declaredMethodsMyAmazingTest) {
            try {
                method.invoke(myAmazingTest);
                System.out.println("Test " + method.getName() + " successfully passed");
                passedTests++;
            } catch (Throwable throwable) {
                failedTests++;
                throwable.printStackTrace();
                System.err.println("Test " + method.getName() + " failed");
            }
        }

        System.out.println("Passed tests: " + passedTests);
        System.out.println("Failed tests: " + failedTests);
    }
}
