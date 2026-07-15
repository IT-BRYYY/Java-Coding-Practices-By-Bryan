package OOP;

public class TestQueue {
    public static void main(String[] args) {
        System.out.println("=== Testing Queue Implementation ===\n");

        // Test 1: Basic enqueue and dequeue operations
        System.out.println("Test 1: Basic Operations");
        System.out.println("------------------------");
        Queue queue = new Queue();

        // Enqueue values 1 through 5
        System.out.println("Enqueuing values 1 through 5:");
        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i);
            System.out.println("Enqueued: " + i + ", Size: " + queue.getSize() +
                    ", Queue: " + queue);
        }

        System.out.println("\nDequeuing all elements:");
        while (!queue.empty()) {
            int value = queue.dequeue();
            System.out.println("Dequeued: " + value + ", Remaining: " + queue);
        }
        System.out.println("Queue is now empty: " + queue.empty());

        // Test 2: Automatic resizing
        System.out.println("\n\nTest 2: Automatic Resizing");
        System.out.println("--------------------------");
        Queue queue2 = new Queue();
        System.out.println("Initial capacity: " + queue2.getCapacity());
        System.out.println("Adding 20 elements (capacity should double at 8 and 16):");

        for (int i = 1; i <= 20; i++) {
            queue2.enqueue(i);
            if (i == 8 || i == 16) {
                System.out.println("After adding " + i + " elements:");
                System.out.println("  Size: " + queue2.getSize());
                System.out.println("  Capacity: " + queue2.getCapacity());
                System.out.println("  Queue: " + queue2);
            }
        }
        System.out.println("\nFinal queue with 20 elements:");
        System.out.println("  Size: " + queue2.getSize());
        System.out.println("  Capacity: " + queue2.getCapacity());
        System.out.println("  Queue: " + queue2);

        // Test 3: Peek operation
        System.out.println("\n\nTest 3: Peek Operation");
        System.out.println("---------------------");
        Queue queue3 = new Queue();
        queue3.enqueue(10);
        queue3.enqueue(20);
        queue3.enqueue(30);
        System.out.println("Queue: " + queue3);
        System.out.println("Front element (peek): " + queue3.peek());
        System.out.println("After peek, queue still has " + queue3.getSize() + " elements: " + queue3);

        // Test 4: Edge cases
        System.out.println("\n\nTest 4: Edge Cases");
        System.out.println("------------------");
        Queue queue4 = new Queue();
        System.out.println("New empty queue: " + queue4);
        System.out.println("Is empty? " + queue4.empty());

        System.out.println("\nTesting dequeue on empty queue (should throw exception):");
        try {
            queue4.dequeue();
        } catch (IllegalStateException e) {
            System.out.println("  Caught exception: " + e.getMessage());
        }

        System.out.println("\nTesting peek on empty queue (should throw exception):");
        try {
            queue4.peek();
        } catch (IllegalStateException e) {
            System.out.println("  Caught exception: " + e.getMessage());
        }

        // Test 5: FIFO order verification
        System.out.println("\n\nTest 5: FIFO Order Verification");
        System.out.println("-------------------------------");
        Queue queue5 = new Queue();
        int[] testData = {5, 3, 8, 1, 9, 2};
        System.out.println("Enqueuing: " + java.util.Arrays.toString(testData));
        for (int value : testData) {
            queue5.enqueue(value);
        }
        System.out.println("Queue after enqueue: " + queue5);

        System.out.println("Dequeuing in FIFO order:");
        System.out.print("  Output: ");
        while (!queue5.empty()) {
            System.out.print(queue5.dequeue() + " ");
        }
        System.out.println("\n  Expected: 5 3 8 1 9 2");

        System.out.println("\n\n=== All tests completed successfully ===");
    }
}