package ru.itsjava.core.annotations;

import java.lang.reflect.Method;
import java.util.*;

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
        List<Method> beforeQueue = new ArrayList<>();
        List<Method> beforeAllQueue = new ArrayList<>();
        List<Method> afterQueue = new ArrayList<>();
        List<Method> afterAllQueue = new ArrayList<>();
        List<Method> testQueue = new ArrayList<>();

        for (Method method : declaredMethodsMyAmazingTest) {
            if (method.isAnnotationPresent(Before.class))
                beforeQueue.add(method);
            if (method.isAnnotationPresent(BeforeAll.class))
                beforeAllQueue.add(method);
            if (method.isAnnotationPresent(After.class))
                afterQueue.add(method);
            if (method.isAnnotationPresent(AfterAll.class))
                afterAllQueue.add(method);
            if (method.isAnnotationPresent(Test.class))
                testQueue.add(method);
        }

        for (int i = 0; i < beforeQueue.size(); i++) {
            try {
                beforeQueue.get(i).invoke(myAmazingTest);
            } catch (Throwable throwable) {
            }
        }
        for (int i = 0; i < testQueue.size(); i++) {
            try {
                for (int j = 0; j < beforeAllQueue.size(); j++) {
                    beforeAllQueue.get(j).invoke(myAmazingTest);
                }
                testQueue.get(i).invoke(myAmazingTest);
                passedTests++;
                System.out.println("Test " + testQueue.get(i).getName() + " successfully passed");

                for (int j = 0; j < afterAllQueue.size(); j++) {
                    afterAllQueue.get(j).invoke(myAmazingTest);
                }
            } catch (Throwable throwable) {
                failedTests++;
                throwable.printStackTrace();
                System.err.println("Test " + testQueue.get(i).getName() + " failed");
            }
        }

        for (int i = 0; i < beforeQueue.size(); i++) {
            try {
                beforeQueue.get(i).invoke(myAmazingTest);
            } catch (Throwable throwable) {
            }
        }

        System.out.println("Passed tests: " + passedTests);
        System.out.println("Failed tests: " + failedTests);
    }
}
