package OOP;

public class Queue {
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 8;

    /**
     * Constructor that creates a Queue object with default capacity 8
     */
    public Queue() {
        elements = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * Adds v into the queue
     */
    public void enqueue(int v) {
        // If the queue is full, double the capacity
        if (size >= elements.length) {
            int[] newElements = new int[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }

        elements[size] = v;
        size++;
    }

    /**
     * Removes and returns the element from the queue (FIFO)
     */
    public int dequeue() {
        if (empty()) {
            throw new IllegalStateException("Queue is empty");
        }

        int firstElement = elements[0];

        // Shift all elements to the left by one position
        for (int i = 0; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        size--;

        return firstElement;
    }

    /**
     * Returns true if the queue is empty
     */
    public boolean empty() {
        return size == 0;
    }

    /**
     * Returns the current size of the queue
     */
    public int getSize() {
        return size;
    }

    /**
     * Returns the element at the front without removing it
     */
    public int peek() {
        if (empty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[0];
    }

    /**
     * Returns the current capacity of the queue
     */
    public int getCapacity() {
        return elements.length;
    }

    /**
     * Returns a string representation of the queue
     */
    @Override
    public String toString() {
        if (empty()) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}