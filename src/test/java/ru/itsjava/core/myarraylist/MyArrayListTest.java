package ru.itsjava.core.myarraylist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс MyArrayList должен: ")
public class MyArrayListTest {

//    @Test
//    @DisplayName("корректно создавать конструктор")
//    public void shouldHaveCorrectConstructor() {
//        final int DEFAULT_CAPACITY = 10;
//        MyArrayList list = new MyArrayList();
//        assertEquals();
//    }

    @Test
    @DisplayName("корректно отображать размер листа")
    public void shouldGetCorrectSize() {
        MyArrayList list = new MyArrayList();
        assertEquals(list.size(), 0);
//        list.add("str");
//        assertEquals(list.size(),1);
    }

    @Test
    @DisplayName("корректно определять, что лист пустой")
    public void shouldGetCorrectMessageIsEmpty() {
        MyArrayList list = new MyArrayList();
        assertEquals(list.isEmpty(), true);
    }

    @Test
    @DisplayName("корректно находить элемент")
    public void shouldGetCorrectContain() {
        MyArrayList list = new MyArrayList();
        list.add("str");
        assertEquals(list.contains("str"), true);
    }

    @Test
    @DisplayName("корректно добавлять элемент")
    public void shouldAddCorrectElement() {
        MyArrayList list = new MyArrayList();
        assertEquals(list.add("str"), true);
    }

    @Test
    @DisplayName("корректно устанавливать элемент по индексу")
    public void shouldSetCorrectElementByIndex() {
        MyArrayList list = new MyArrayList();
        list.set(0, "setStr");
        assertEquals(list.get(0), "setStr");
    }

    @Test
    @DisplayName("корректно добавлять элемент по индексу")
    public void shouldAddCorrectElementByIndex() {
        MyArrayList list = new MyArrayList();
        list.add(5, "addStr");
        System.out.println(list.toString());
        assertEquals(list.get(5), "addStr");
    }

    @Test
    @DisplayName("корректно удалять элемент")
    public void shouldCorrectRemove() {
        MyArrayList list = new MyArrayList();
        list.add(5, "addStr");
        list.add(6, "addStr6");
        System.out.println(list.toString());
        System.out.println(list.remove("addStr"));
        System.out.println(list.toString());
        assertEquals(list.get(5), "addStr6");
    }

    @Test
    @DisplayName("корректно удалять элемент по индексу")
    public void shouldCorrectRemoveElementByIndex() {
        MyArrayList list = new MyArrayList();
        list.add(5, "addStr");
        list.add(6, "addStr6");
        System.out.println(list.toString());
        list.remove(5);
        System.out.println(list.toString());
        assertEquals(list.get(5), "addStr6");
    }

    @Test
    @DisplayName("корректно очищать лист  ")
    public void shouldCorrectClear() {
        MyArrayList list = new MyArrayList();
        list.add(5, "addStr");
        list.add(6, "addStr6");
        System.out.println(list.toString());
        list.clear();
        System.out.println(list.toString());
        assertEquals(list.isEmpty(), true);
    }

    @Test
    @DisplayName("корректно отображать индекс элемента")
    public void shouldGetCorrectIndex() {
        MyArrayList list = new MyArrayList();
        list.add(5, "addStr5");
        list.add(6, "addStr6");
        System.out.println(list.toString());
        assertEquals(list.indexOf("addStr5"), 5);
    }

    @Test
    @DisplayName("корректно отображать индекс последниего элемента")
    public void shouldGetCorrectIndexLastElement() {
        MyArrayList list = new MyArrayList();
        list.add(1, "addStr5");
        list.add(2, "addStr2");
        list.add(5, "addStr5");
        list.add(6, "addStr6");
        System.out.println(list.toString());
        assertEquals(list.indexOf("addStr5"), 5);
    }

}
