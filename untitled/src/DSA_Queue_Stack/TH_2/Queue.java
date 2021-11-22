package DSA_Queue_Stack.TH_2;

public class Queue {

    public class NODE {
        public int key;
        public NODE next;

        NODE(int key) {
            this.key = key;
            this.next = null;
        }
    }

    private NODE heat;
    private NODE tail;

    public Queue() {
        this.heat = null;
        this.tail = null;
    }

    public void enQueue(int key) {
        NODE temp = new NODE(key);
        if (this.tail == null) {
            this.heat = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public NODE dequeue() {
        if (this.heat == null)
            return null;
        NODE temp = this.heat;
        this.heat = this.heat.next;
        if (this.heat == null)
            this.tail = null;
        return temp;
    }
}



