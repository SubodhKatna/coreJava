package collections.queue.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeAsQueue {

	public static void main(String[] args) {

		Deque<String> queue = new ArrayDeque<>();

		// Enqueue (tail)
		queue.offerLast("Task 1");
		queue.offerLast("Task 2");
		queue.offerLast("Task 3");

		System.out.println("Queue: " + queue);

		// Dequeue (head)
		System.out.println("Processing: " + queue.pollFirst());
		System.out.println("Processing: " + queue.pollFirst());

		System.out.println("Remaining: " + queue);
	}
}
