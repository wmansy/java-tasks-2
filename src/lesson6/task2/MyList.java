package lesson6.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    Node<E> list = new Node<E>();

    public int size() {
        Node<E> point = list;
        int size = 0;
        while (point.next != null) {
            point = point.next;
            size++;
        }
        return size;
    }

    public void add(E item) {
        Node<E> u = new Node<E>(item);
        Node<E> point = list;
        while (point.next != null)
            point = point.next;
        point.next = u;
    }

    public void remove(int index) {
        Node<E> point = list;
        int i = 0;
        while (i++ < index)
            point = point.next;
        point.next = point.next.next;
    }

   public void remove(E item) {
        Node<E> point = list;
        while (point.next.data != item)
            point = point.next;
        point.next = point.next.next;
    }

    public E get(int index) {
        Node<E> point = list;
        int i = 0;
        while (i++ <= index)
            point = point.next;
        return point.data;
    }

    public void clear() {
        list.data = null;
        while (list.next != null){
            list = list.next;
            list.data = null;
        }
    }

    public void print() {
        int i = 0;
        Node<E> point = list;
        while (point.next != null) {
            ++i;
            point = point.next;
            System.out.print(point.data + " ");
        }
        System.out.println("\ni " + i);
    }

    public static void main(String[] msi) {
        MyList<Integer> test = new MyList<>();
        ArrayList<Integer> t1 = new ArrayList<>(Arrays.asList(0, 1, 2));
        System.out.println(t1.size());
        test.add(0);
        test.add(1);
        test.add(2);
        test.print();
        // System.out.println("my size " + test.size());
        // test.remove(2);
        // test.print();
        // System.out.println(test.get(1));
        test.clear();
        test.print();
        // System.out.println("my size " + test.size());
        // System.out.println("t1 " + t1.size());
    }
}
