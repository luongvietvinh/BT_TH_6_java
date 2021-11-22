package DSA_Queue_Stack.TH_2;

public class main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}
