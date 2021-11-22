package lesson6.task2;

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

    @SafeVarargs
    public final void add(E... a) {
        for (E item : a)
            add(item);
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
        while (point.next.data != item) {
            if (point.next.next == null)
                return;
            point = point.next;
        }
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
        while (list.next != null) {
            list = list.next;
            list.data = null;
        }
    }

    public void print() {
        Node<E> point = list;
        while (point.next != null) {
            point = point.next;
            System.out.print(point.data + " ");
        }
        System.out.println();
    }
}
