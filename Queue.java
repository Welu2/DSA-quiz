public class Queue {
    private int maxSize; // Maximum size of the queue
    private int[] queueArray; // Array to store queue elements
    private int front; // Index of the front element
    private int rear; // Index of the rear element
    private int currentSize; // Current number of elements in the queue

    // Constructor to initialize the queue
    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return currentSize == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return currentSize == maxSize;
    }

    // Method to add an element to the rear of the queue
    public void enqueue(int item) {
        if (!isFull()) {
            rear = (rear + 1) % maxSize;
            queueArray[rear] = item;
            currentSize++;
        } else {
            System.out.println("Queue is full. Cannot enqueue " + item);
        }
    }

    // Method to remove an element from the front of the queue
    public int dequeue() {
        if (!isEmpty()) {
            int removedItem = queueArray[front];
            front = (front + 1) % maxSize;
            currentSize--;
            return removedItem;
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Return -1 indicating queue underflow
        }
    }

    // Method to get the front element of the queue without removing it
    public int peek() {
        if (!isEmpty()) {
            return queueArray[front];
        } else {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; // Return -1 indicating queue underflow
        }
    }

    // Method to display the elements of the queue
    public void display() {
        if (!isEmpty()) {
            System.out.print("Queue elements: ");
            int count = 0;
            int index = front;
            while (count < currentSize) {
                System.out.print(queueArray[index] + " ");
                index = (index + 1) % maxSize;
                count++;
            }
            System.out.println();
        } else {
            System.out.println("Queue is empty.");
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display(); // Output: 10 20 30 40 50

        queue.dequeue();
        queue.dequeue();

        queue.display(); // Output: 30 40 50

        System.out.println("Front element: " + queue.peek()); // Output: Front element: 30
    }
}
