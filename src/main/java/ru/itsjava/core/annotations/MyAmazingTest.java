package ru.itsjava.core.annotations;

public class MyAmazingTest {
    @Before
    public void Before() {
        System.out.println("Before");
    }

    @BeforeAll
    public void BeforeAll() {
        System.out.println("Before All");
    }

    @After
    public void After() {
        System.out.println("After");
    }

    @AfterAll
    public void AfterAll() {
        System.out.println("After all");
    }

    @Test
    public void test1() {
    }

    @Test
    public void test2() {
    }

    @Test
    public void test3() {
        throw new AssertionError();
    }
}
