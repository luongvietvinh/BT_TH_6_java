package DSA_Queue_Stack.TH_1_Stack_Node;

public class MyStack<E> {
    private int SIZE;
     E[] element =(E[]) new Object[5];

     public void updateArray(){
         E[] newElement = (E[]) new Object[element.length * 2];
         for (int i = 0; i < element.length; i++) {
             newElement[i] = element[i];
         }
        element = newElement;
     }

     public void add (E e){
         //thêm e vào mảng
         if (SIZE == element.length){
             //nhân đoi mảng lên
             updateArray();
         }
         element[SIZE] = e;
         SIZE++;
     }
    public E pop() {
       E  element1 = element[SIZE -1];
        element[SIZE - 1] = null;
        SIZE--;
        return element1;
    }
    public void show() {
        for (int i = 0; i < element.length; i++) {
            System.out.println(element[i]);
        }
    }

     E get () {
         return element[SIZE - 1];
     }
     public boolean isEmpty() {
         if (SIZE == 0) {
             return true;
         }
         return false;
     }

}
