package ru.itsjava.core.collections.list.linkedlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.core.collections.list.arraylist.MyArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс MyLinkedList должен: ")
public class MyLinkedListTest {

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
        MyLinkedList list = new MyLinkedList();
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
        MyLinkedList list = new MyLinkedList();
        assertEquals(list.isEmpty(), true);
    }

    @Test
    @DisplayName("корректно находить элемент")
    public void shouldGetCorrectContain() {
        MyLinkedList list = new MyLinkedList();
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
        MyLinkedList list = new MyLinkedList();
        assertEquals(list.add("str"), true);
        System.out.println("list = " + list);
    }

    @Test
    @DisplayName("корректно устанавливать элемент по индексу")
    public void shouldSetCorrectElementByIndex() {
        MyLinkedList list = new MyLinkedList();
        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add("str4");
        list.add("str5");
        list.add("str6");
        list.set(2, "setStr");
        assertEquals(list.get(2), "setStr");
    }

    @Test
    @DisplayName("корректно добавлять элемент по индексу")
    public void shouldAddCorrectElementByIndex() {
        MyLinkedList list = new MyLinkedList();
        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add("str4");
        list.add("str5");
        list.add("str6");
        list.add(0, "addStr");
//        System.out.println(list.toString());
        assertEquals(list.get(0), "addStr");
    }

    @Test
    @DisplayName("корректно удалять элемент")
    public void shouldCorrectRemove() {
        MyLinkedList list = new MyLinkedList();
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
        MyLinkedList list = new MyLinkedList();
        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add("str4");
        list.add("str5");
        list.add("str6");
        System.out.println("remove element - " + list.remove(1));
        assertEquals(list.get(1), "str3");
        //валится на всем
    }

    @Test
    @DisplayName("корректно очищать лист  ")
    public void shouldCorrectClear() {
        MyLinkedList list = new MyLinkedList();
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
        MyLinkedList list = new MyLinkedList();
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
        MyLinkedList list = new MyLinkedList();
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
