package DSA_Queue_Stack.Array;

public class QUEUE implements Queue_Stack {
    private int[] array;
    private int SIZE;
    private int headindex;
    private int telIndex;

    QUEUE(int size) {
        SIZE = size;
        array = new int[SIZE];
        headindex = telIndex = -1;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()){
            if (isEmisEmpty()){
                headindex++;
            }
            telIndex++;
            array[telIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        int value = -1;
        if (!isEmisEmpty()){
            value = array[headindex];
            headindex++;
            if (headindex > telIndex){
                headindex = telIndex = -1;
            }
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        return telIndex == SIZE-1;
    }

    @Override
    public boolean isEmisEmpty() {
        return (headindex == -1) && (telIndex == -1);
    }
    public int count () {
        if (isEmisEmpty())
            return 0;
            return telIndex - headindex +1;
    }

    @Override
    public void show() {
        if (isEmisEmpty()){
            System.out.println("mảng rỗng");
        }else {
            for (int i = headindex; i <= telIndex ; i++) {
                System.out.println(array[i] + " ");
            }
            System.out.println();
        }

    }
}
