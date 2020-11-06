package ru.itsjava.core.collections.list.linkedlist;

public class MyLinkedList {
    private Node head;

    public int size() {
        Node curNode = head;
        int count = 0;
        while ((curNode = curNode.getNext()) != null) {
            count++;
        }
        return count + 1;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public boolean contains(Object o) {
        if (head == null) return false;
        if (head.getValue().equals(o)) {
            return true;
        }
        if (head.getNext() == null) return false;

        Node curNode = head;

        while ((curNode = curNode.getNext()) != null) {
            if (curNode.getValue().equals(o)) {
                return true;
            }
        }
        return false;
    }

    public boolean add(Object o) {
        //пустой список
        if (head == null) {
            head = new Node(o, null);
            return true;
        }
        //есть голова списка
        //пробежали весь список до последнего элемента
        Node curNode = head;
        while (curNode.getNext() != null) {
            curNode = curNode.getNext();
        }
        //вставили узел в конец списка
        curNode.setNext(new Node(o, null));
        return true;
    }

    public boolean remove(Object o) {
        if (head == null) return false;
        if (head.getValue().equals(o)) {
            head = head.getNext();
            return true;
        }
        if (head.getNext() == null) return false;

        Node curNode = head;
        Node prevNode = head;

        while ((curNode = curNode.getNext()) != null) {
            if (curNode.getValue().equals(o)) {
                break;
            }
            prevNode = prevNode.getNext();
        }

        if (curNode == null) return false;

        prevNode.setNext(curNode.getNext());
        return true;
    }

    public void clear() {
        head = null;
    }

    public Object get(int index) {
        checkIndex(index);

        if (index == 0) return head.getValue();
        Node curNode = head;
        int count = 0;
        while ((curNode = curNode.getNext()) != null) {
            count++;
            if (index == count) return curNode.getValue();
        }
        return null;
    }

    private void checkIndex(int index) {
        if ((index >= size()) || (index < 0)) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    public Object set(int index, Object element) {
        checkIndex(index);

        if (index == 0) {
            head.setValue(element);
            return head.getValue();
        }

        Node curNode = head;
        int count = 1;
        while ((curNode = curNode.getNext()) != null) {
            if (index == count) {
                curNode.setValue(element);
                break;
            }
            count++;
        }
        return curNode.getValue();
    }


    public void add(int index, Object element) {
        checkIndex(index);
        Node curNode = head;
        Node prevNode = head;
        int count = 0;

        if (index == 0) {
            head = new Node(element, head);
            return;
        }
        while ((curNode = curNode.getNext()) != null) {
            count++;
            if (count == index) {
                break;
            }
            prevNode = prevNode.getNext();
        }
        prevNode.setNext(new Node(element, curNode));
    }

    public Object remove(int index) {
        checkIndex(index);
        Object delElement;
        // не придумала, как без этой ссылки обойтись, ибо возвращаем в результате элемент, который удалили. Или нет?

        if (index == 0) {
            delElement = head.getValue();
            head = head.getNext();
            return delElement;
        }

        Node curNode = head;
        Node prevNode = head;

        int count = 1;
        while ((curNode = curNode.getNext()) != null) {

            if (index == count) {
                break;
            }
            prevNode = prevNode.getNext();
            count++;
        }

        prevNode.setNext(curNode.getNext());
        return curNode.getValue();
    }

    public int indexOf(Object o) {
        if (head == null) return -1;
        if (head.getValue().equals(o)) {
            return 0;
        }
        if (head.getNext() == null) return -1;

        Node curNode = head;
        int count = 1;
        while ((curNode = curNode.getNext()) != null) {
            if (curNode.getValue().equals(o)) {
                return count;
            }
            count++;
        }
        return -1;
    }
    //смущают возвращаемые значения. -1 корректно писать?

    public int lastIndexOf(Object o) {
        int lastIndex = 0;
        int count = 1;
        if (head == null) return -1;
        if (head.getValue().equals(o)) return 0;
        if (head.getNext() == null) return -1;

        Node curNode = head;

        while ((curNode = curNode.getNext()) != null) {
            if (curNode.getValue().equals(o)) {
                lastIndex = count;
            }
            count++;
        }
        return lastIndex;
    }


    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
