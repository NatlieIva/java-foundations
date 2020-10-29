package ru.itsjava.core.myarraylist;


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
        for (Object value : array) {
            if (value.equals(o)) {
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
        return false;
    }


    public void clear() {
        array = new Object[realSize];
        for (int i = 0; i < realSize; i++) {
            //не понимаю, почему без (i = realSize = 0) не работает
            array[i] = null;
        }
        realSize = 0;
        //по аналогии с докуентацией:
//        array = new Object[realSize];
//        for (int to = realSize, i = realSize = 0; i < to; i++)
//            array[i] = null;
//        }
    }


    public Object get(int index) {
        return null;
    }


    public Object set(int index, Object element) {
        return null;
    }


    public void add(int index, Object element) {

    }


    public Object remove(int index) {
        return null;
    }


    public int indexOf(Object o) {
        return 0;
    }


    public int lastIndexOf(Object o) {
        return 0;
    }
}
