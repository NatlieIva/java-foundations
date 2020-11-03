package ru.itsjava.core.myarraylist;


import java.util.Arrays;
import java.util.List;

public class MyArrayList {

    private static final int DEFAULT_CAPACITY = 10;
    private int realSize = 0;
    private Object[] array;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
    }

    public int size() {
        return realSize;
    }


    public boolean isEmpty() {
        return realSize == 0;
    }


    public boolean contains(Object o) {
        if (o == null) return false;
        for (Object value : array) {
            if (o.equals(value)) {
                return true;
            }
        }
        return false;
    }


    public boolean add(Object o) {
        if (realSize == array.length) {
            var resArray = new Object[array.length * 3 / 2 + 1];

            System.arraycopy(array, 0, resArray, 0, array.length);
            array = resArray;
        }
        array[realSize++] = o;
        return true;
    }


    public boolean remove(Object o) {
        if (o == null) return false;
        int delIndex = -1;
        for (int i = 0; i < realSize; i++) {
            if (o.equals(array[i])) {
                delIndex = i;
                break;
            }
        }
        if (delIndex == -1) return false;
        for (int i = delIndex; i < realSize; i++) {
            array[i] = array[i + 1];
//            array[i + 1] = null;
        }
        realSize--;
        array[realSize] = null;
        return true;
    }


    public void clear() {
        array = new Object[realSize];
        for (int i = 0; i < realSize; i++) {
            //не понимаю, почему без (i = realSize = 0) не работает
            array[i] = null;
        }
        realSize = 0;
    }


    public Object get(int index) {
        if ((index < 0) || (index > array.length)) throw new ArrayIndexOutOfBoundsException(index);
        return array[index];
    }


    public Object set(int index, Object element) {
        if ((index < 0) || (index > array.length)) throw new ArrayIndexOutOfBoundsException(index);
        array[index] = element;
        return array;
    }


    public void add(int index, Object element) {
        if ((index < 0) || (index > array.length)) throw new ArrayIndexOutOfBoundsException(index);
        if (realSize == array.length) {
            var resArray = new Object[array.length * 3 / 2 + 1];

            System.arraycopy(array, 0, resArray, 0, array.length);
            array = resArray;
        }
        Object moveElement = array[index];
        realSize++;
        array[index] = element;
        for (int i = realSize; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index + 1] = moveElement;
    }


    public Object remove(int index) {
        if ((index < 0) || (index > array.length)) throw new ArrayIndexOutOfBoundsException(index);
        for (int i = index; i < realSize; i++) {
            array[i] = array[i + 1];
            array[i + 1] = null;
        }
        realSize--;
        return true;
    }


    public int indexOf(Object o) {
        if (o == null) return -1;
        for (int index = 0; index < realSize; index++) {
            if (o.equals(array[index])) {
                return index;
            }
        }
        return -1;
    }


    public int lastIndexOf(Object o) {
        if (o == null) return -1;
        for (int index = realSize; index > 0; index--) {
            if (o.equals(array[index])) {
                return index;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder printArray = new StringBuilder();
        for (int i = 0; i < realSize; i++) {
            printArray.append(array[i] + ", ");
        }
        return "MyArrayList{" +
                "array= " + printArray +
                '}';
    }

}
