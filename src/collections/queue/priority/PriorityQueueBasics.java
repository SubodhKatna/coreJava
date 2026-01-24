package collections.queue.priority;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasics {

	public static void main(String[] args) {

		/*
		 * PriorityQueue characteristics: 
		 * - Orders elements by priority 
		 * - Default:min-heap 
		 * - Does NOT allow null elements 
		 * - NOT thread-safe 
		 * - No index-based access
		 */

		Queue<Integer> pq = new PriorityQueue<>();

		// 1. Insert elements (unordered insertion)
		pq.offer(40);
		pq.offer(10);
		pq.offer(30);
		pq.offer(20);

		System.out.println("PriorityQueue: " + pq);

		// 2. Peek (highest priority = smallest)
		System.out.println("Peek: " + pq.peek()); // 10

		// 3. Poll (remove highest priority)
		System.out.println("Poll: " + pq.poll()); // 10
		System.out.println("After poll: " + pq);
	}
}
