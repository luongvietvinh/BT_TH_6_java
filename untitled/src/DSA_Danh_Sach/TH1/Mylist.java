package DSA_Danh_Sach.TH1;

import java.util.Arrays;

public class Mylist<E> {

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public Mylist () {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensurecapa(){
        int newsize = elements.length * 2;
        elements = Arrays.copyOf(elements,newsize);
    }
    public void add (E e) {
        if (size == elements.length){
            ensurecapa();
        }
        elements[size++] = e;
    }
    public E get(int i) {
        if (i >= size || i < 0){
            throw new IndexOutOfBoundsException("index: " + i + "size: " + i);
        }
        return (E) elements[i];
    }
}
