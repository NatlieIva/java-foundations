package ru.itsjava.core.annotations;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class MyAmazingTestLogic {
    private int passedTests = 0;
    private int failedTests = 0;

    MyAmazingTest myAmazingTest = new MyAmazingTest();
    Method[] declaredMethodsMyAmazingTest = MyAmazingTest.class.getDeclaredMethods();
    List<Method> beforeQueue = new ArrayList<>();
    List<Method> beforeAllQueue = new ArrayList<>();
    List<Method> afterQueue = new ArrayList<>();
    List<Method> afterAllQueue = new ArrayList<>();
    List<Method> testQueue = new ArrayList<>();

    public void startTesting() {
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

        invokeMethods(myAmazingTest, beforeQueue);
        for (Method methodTest : testQueue) {
            try {
                invokeMethods(myAmazingTest, beforeAllQueue);

                methodTest.invoke(myAmazingTest);
                passedTests++;
                System.out.println("Test " + methodTest.getName() + " successfully passed");

                invokeMethods(myAmazingTest, afterAllQueue);

            } catch (Throwable throwable) {
                failedTests++;
                throwable.printStackTrace();
                System.err.println("Test " + methodTest.getName() + " failed");
            }
        }

        invokeMethods(myAmazingTest, afterQueue);

        System.out.println("Passed tests: " + passedTests);
        System.out.println("Failed tests: " + failedTests);
    }

    private static void invokeMethods(MyAmazingTest myAmazingTest, List<Method> queue) {
        for (Method method : queue) {
            try {
                method.invoke(myAmazingTest);
            } catch (Throwable throwable) {
            }
        }
    }
}
