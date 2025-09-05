import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // offer() - to insert elements
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");

        // Display the queue
        System.out.println("Queue after offer(): " + queue);

        // peek() - to view the front element without removing it
        System.out.println("Element at front (peek): " + queue.peek());

        // poll() - removes and returns the front element
        System.out.println("Removed element (poll): " + queue.poll());

        // Display the queue after poll
        System.out.println("Queue after poll(): " + queue);
    }
}
