package DSA_Queue_Stack.BT_2;

import DSA_Queue_Stack.TH_2.Queue;

import java.util.ArrayList;

public class MyStack<E> {

    public class Node <E> {
        int SIZE;
        Node next;
        E data;

        Node(int SIZE) {
            this.SIZE = SIZE;
        }
    }
        Node topnode;

    MyStack(){
        topnode = null;

    }
    public void push(int size){
        Node newnode = new Node(size);
        newnode.next = topnode;
        topnode = newnode;
    }

    public int pop() {
        if (isEmpty())
            return -1;
            int value = topnode.SIZE;

            topnode = topnode.next;
            return value;
    }
    public void show() {
        if (isEmpty()){
            System.out.println("mảng rỗng ");
            return;
        }
        Node temp = topnode;
        ArrayList<Integer> templist = new ArrayList<>();

        while (temp != null){
            //in ra giá trị của mảng binhg thường
            System.out.println(temp.SIZE);
            temp = temp.next;
//            templist.add(temp.SIZE);
//            temp = temp.next;
        }
//        for (int i = templist.size()-1; i < 0 ; i--) {
//            System.out.println(templist.get(i) + " ");
//        }
//        System.out.println();
    }

    public boolean isEmpty(){
        return topnode == null;
    }

}
