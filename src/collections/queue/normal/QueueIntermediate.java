package collections.queue.normal;

import java.util.LinkedList;
import java.util.Queue;

public class QueueIntermediate {

	public static void main(String[] args) {

		Queue<String> requestQueue = new LinkedList<>();

		// 1. offer() – Preferred over add()
		requestQueue.offer("Request A");
		requestQueue.offer("Request B");
		requestQueue.offer("Request C");

		System.out.println("Queue: " + requestQueue);

		// 2. peek() – Safe head check
		System.out.println("Peek: " + requestQueue.peek());

		// 3. poll() – Safe removal
		System.out.println("Poll: " + requestQueue.poll());
		System.out.println("After poll: " + requestQueue);

		// 4. element() – Throws exception if empty
		System.out.println("Element(): " + requestQueue.element());

		// 5. Iteration (FIFO order)
		System.out.print("Processing Queue: ");
		for (String req : requestQueue) {
			System.out.print(req + " -> ");
		}
		System.out.println("END");
	}
}
