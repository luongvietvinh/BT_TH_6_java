package DSA_Queue_Stack.Array;

import DSA_Queue_Stack.Array.Queue_Stack;

public class STACK implements Queue_Stack {
    private int[] array;
    private  int SIZE;
    private int topIndex;

    STACK(int size){
        SIZE = size;
        array = new int[SIZE];
        topIndex = -1;

    }

    @Override
    public boolean push(int value) {
            if (!isFull()){
            topIndex++;
            array[topIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (!isEmisEmpty()){
            int value = array[topIndex];
            topIndex--;
            return value;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        return topIndex == SIZE-1;
    }

    @Override
    public boolean isEmisEmpty() {
        return topIndex < 0;
    }

    @Override
    public void show() {
        if (isEmisEmpty()){
            System.out.println("mảng rỗng ko còn pt");
        }else {
            for (int i = 0; i <= topIndex; i++) {
                System.out.println(array[i] + " ");
            }
            System.out.println();
        }
    }
}
