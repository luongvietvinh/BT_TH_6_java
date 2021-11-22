package DSA_Danh_Sach.BT_1;

import org.junit.jupiter.api.BeforeAll;

public class Mylist<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    static Object element[];

    public Mylist() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public Mylist(int capasity) {
        element = new Object[capasity];
    }

    void add(int index, E elements) {

        Object[] arrlist = new Object[element.length + 1];
        for (int i = 0; i < element.length; i++) {
            arrlist[i] = element[i];
        }
        arrlist[arrlist.length - 1] = elements;
    }

    public E remove(int index) {
        Object[] newarr = new Object[element.length - 1];
        for (int i = 0; i < element.length; i++) {
            if (index > i) {
                newarr[i] = element[i];
            } else {
                newarr[i] = element[i + 1];
            }
        }
        return (E) newarr;
    }

    public int size() {
        size = element.length;
        return size;
    }

    public Object clones() {
        Object[] cloneNumber = (Object[]) element.clone();
        return cloneNumber;
    }

    public void containnss(boolean o) {
        Object[] check = new Object[element.length];

    }
}

