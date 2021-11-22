package DSA_Queue_Stack.LinkerList;

public class Stack implements Queue_Stack{

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
        Node topNode;

            Stack() {
            topNode = null;
        }


    @Override
    public boolean push(int value) {
                if (!isFull()){
                    Node newnode = new Node(value);
                    newnode.next = topNode;
                    topNode = newnode;
                    return true;
                }
        return false;
    }

    @Override
    public int pop() {
                if (isEmpty())
                    return -1;
                int value = topNode.value;
                topNode = topNode.next;
        return value;

    }

    @Override
    public boolean isFull() {
        return true;
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public void show() {
    if (isEmpty()) {
        System.out.println("mảng rỗng");
        return;
    }
    Node temp = topNode;
    while (temp != null) {
        System.out.println(temp.value + " ");
        temp = temp.next;

    }
    }
}
