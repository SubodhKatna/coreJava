package collections.queue.normal;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics {

	public static void main(String[] args) {

		/*
		 * Queue characteristics: - FIFO order - Insert at TAIL - Remove from HEAD - No
		 * index-based access
		 */

		Queue<String> taskQueue = new LinkedList<>();

		// 1. add() – Insert at tail
		taskQueue.add("Task 1");
		taskQueue.add("Task 2");
		taskQueue.add("Task 3");

		System.out.println("Queue: " + taskQueue);

		// 2. peek() – View head (does NOT remove)
		System.out.println("Peek (Head): " + taskQueue.peek());

		// 3. remove() – Remove head (throws exception if empty)
		String removed = taskQueue.remove();
		System.out.println("Removed: " + removed);

		System.out.println("Queue after remove: " + taskQueue);

		// 4. size & empty check
		System.out.println("Size: " + taskQueue.size());
		System.out.println("Is Empty? " + taskQueue.isEmpty());
	}
}
