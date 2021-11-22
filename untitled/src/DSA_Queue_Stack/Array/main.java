package DSA_Queue_Stack.Array;

public class main {
    public static void main(String[] args) {
       QUEUE queue = new QUEUE(4);
       queue.push(1);
       queue.push(2);
       queue.push(3);
       queue.push(4);

       queue.show();
       queue.pop();
       queue.pop();
       queue.pop();
       queue.show();
    }

}
