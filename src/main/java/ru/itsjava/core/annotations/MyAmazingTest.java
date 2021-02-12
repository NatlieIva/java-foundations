package ru.itsjava.core.annotations;

public class MyAmazingTest {
    @Before
    public void test1Before() {
    }

    @BeforeAll
    public void test2BeforeAll() {
    }

    @Test
    public void test3() {

    }

    @AfterAll
    public void test4AfterAll() {
    }

    @BeforeAll
    public void test5BeforeAll() {
        ;
    }

    @Test
    public void test6() {
    }

    @AfterAll
    public void test7AfterAll() {

    }

    @BeforeAll
    public void test8BeforeAll() {
    }

    @Test
    public void test9() {
        throw new AssertionError();
    }

    @AfterAll
    public void test10AfterAll() {
    }

    @After
    public void test11After() {
    }
}
