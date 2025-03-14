package Queue;

class QueueArray {
    private int front, rear, size;
    private int capacity;
    private int[] queue;

    public QueueArray(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue operation
    public void enqueue(int item) {
        if (size == capacity) {
            System.out.println("Queue is Full!");
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment
        queue[rear] = item;
        size++;
    }

    // Dequeue operation
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        int item = queue[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
        return item;
    }

    // Peek front element
    public int peek() {
        if (size == 0) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        return queue[front];
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Display queue
    public void display() {
        if (size == 0) {
            System.out.println("Queue is Empty!");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();

        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();

        System.out.println("Front element: " + queue.peek());
    }
}

