package by.guru13.lessons.clinic;

import java.util.Iterator;

/**
 * ����� ������� ���������� ���������� ������
 * @param <E>
 */
public class SimpleLinkedList<E> implements Iterable<E>{

    private Node root;
    /**
     * ������ ������
     */
    private int size;

    /**
     * ����������� ������������� ������ ������ ������ 0
     */
    public SimpleLinkedList() {
        this.size = 0;
    }

    /**
     * ��������� ������ � ������ ������
     * @param object ����������� ������
     */
    public void addFirst(E object) {
        Node node = new Node();
        node.obj = object;
        if (root != null) {
            node.ref = root;
        }
        root = node;
        size++;

    }

    /**
     * ��������� ������ � ����� ������
     * @param object ����������� ������
     */
    public void addLast(E object) {
        Node node = new Node();
        node.obj =  object;

        if (root == null) {
            root = node;
        } else {
            Node last = root;
            while (last.ref != null) {
                last = last.ref;
            }
            last.ref = node;
        }
        size++;
    }

    /**
     * ��������� ������ � �������� ������, ����� ���������� �������
     * @param object ����������� ������
     * @param prev ������, ����� �������� ����������� ������ ������
     */
    public void addAfter(E object, E prev) {
        Node prevPointer = null;
        Node cp = root;
        do {
            if (cp.obj == prev) {
                prevPointer = cp;
                break;
            }
            cp = cp.ref;
        } while (cp != null && cp.ref != null);

        if (prevPointer == null) {
            throw new IllegalStateException("List doesn't contain prev object");
        }
        Node node = new Node();
        node.obj = object;
        if (prevPointer.ref != null) {
            node.ref = prevPointer.ref;
        }
        prevPointer.ref = node;
        size++;

    }

    /**
     * ���������� ������ ������
     * @return ������ ������
     */
    public int getSize() {
        return size;
    }

    /**
     * ���������� ������ ��� �������� index
     * @param index ������ ������������� �������
     * @return ���������� ������ ��� �������� index
     */
    public E get(int index) {
        int i = 0;
        E element = null;
        Iterator<E> it = this.iterator();
        while (index != i) {
            element = it.next();
            i++;
        }
        return element;
    }

    /**
     * ���������� �������� �����
     * @return ����� ��������
     */
    public Iterator<E> iterator() {
        return new SllIterator();
    }


    private class Node {
        E obj;
        Node ref;
    }

    /**
     * �����-��������
     * @param <E>
     */
    private class SllIterator<E> implements Iterator<E> {
        private Node prev;
        private Node cp;

        public SllIterator() {
        }

        /**
         * ���������� ���� �� ��������� �������
         * @return true ���� ���� ��������� �������
         */
        public boolean hasNext() {
            return (cp == null && root != null) || (cp != null && cp.ref != null);
        }

        /**
         * ���������� ��������� �������
         * @return ���������� ��������� �������
         */
        public E next() {
            if (cp == null){
                cp = root;
                return (E) cp.obj;
            }
            if (hasNext()){
                prev = cp;
                cp = cp.ref;
                return (E) cp.obj;
            }
            throw new IllegalStateException("List has no more elements");
        }

        /**
         * ������ ������ �������
         */
        public void remove() {
            if (!hasNext() && prev == null){
                //only one element
                cp = null;
                root = null;
            }else if (!hasNext() && prev != null){
                //last element
                prev.ref = null;
                cp = null;
            }else if (hasNext() && prev == null){
                //first element
                root = cp.ref;
                cp = root;
            }else {
                // middle element
                prev.ref = cp.ref;
                cp = cp.ref;
            }
            size--;

        }
    }
}
