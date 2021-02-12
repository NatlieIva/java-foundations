package ru.itsjava.core.annotations;

public class MyAmazingTest {
    @Test
    public void test1() {
    }

    @Before
    public void test2() {
        System.out.println("Before");
    }

    @BeforeAll
    public void test3() {
        System.out.println("Before all!");
    }

    @Test
    public void test4() {
        throw new AssertionError();
    }

    @AfterAll
    public void test5() {
        System.out.println("After");
    }

    @After
    public void test6() {
        System.out.println("After all!");
    }

    @Test
    public void test7() {
    }
}
