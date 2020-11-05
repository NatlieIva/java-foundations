package ru.itsjava.core.collections.list.arraylist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add("str4");
        list.add("str5");
        list.add("str6");
        assertEquals(list.size(), 6);
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
        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add("str4");
        list.add("str5");
        list.add("str6");
        assertEquals(list.contains("str3"), true);
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
//        System.out.println(list.toString());
        assertEquals(list.get(5), "addStr");
    }

    @Test
    @DisplayName("корректно удалять элемент")
    public void shouldCorrectRemove() {
        MyArrayList list = new MyArrayList();
        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add("str4");
        list.add("str5");
        list.add("str6");
        System.out.println(list.remove("str3"));
        assertEquals(list.get(2), "str4");
    }

    @Test
    @DisplayName("корректно удалять элемент по индексу")
    public void shouldCorrectRemoveElementByIndex() {
        MyArrayList list = new MyArrayList();
        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add("str4");
        list.add("str5");
        list.add("str6");
        System.out.println(list.remove(3));
        assertEquals(list.get(3), "str5");
    }

    @Test
    @DisplayName("корректно очищать лист  ")
    public void shouldCorrectClear() {
        MyArrayList list = new MyArrayList();
        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add("str4");
        list.add("str5");
        list.add("str6");
        System.out.println(list.toString());
        list.clear();
        System.out.println(list.toString());
        assertEquals(list.isEmpty(), true);
    }

    @Test
    @DisplayName("корректно отображать индекс элемента")
    public void shouldGetCorrectIndex() {
        MyArrayList list = new MyArrayList();
        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add("str4");
        list.add("str5");
        list.add("str6");
        System.out.println(list.toString());
        assertEquals(list.indexOf("str3"), 2);
    }

    @Test
    @DisplayName("корректно отображать индекс последнего элемента")
    public void shouldGetCorrectIndexLastElement() {
        MyArrayList list = new MyArrayList();
        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add("str4");
        list.add("str5");
        list.add("str3");
        list.add("str3");
        list.add("str6");

        System.out.println(list.toString());
        assertEquals(list.lastIndexOf("str3"), 6);
    }

}
