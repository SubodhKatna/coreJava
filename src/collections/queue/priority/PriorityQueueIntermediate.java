package collections.queue.priority;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueIntermediate {

	public static void main(String[] args) {

		Queue<Integer> pq = new PriorityQueue<>();

		pq.offer(50);
		pq.offer(20);
		pq.offer(40);
		pq.offer(10);

		System.out.print("Processing order: ");
		while (!pq.isEmpty()) {
			System.out.print(pq.poll() + " ");
		}
		// Output: 10 20 40 50
		System.out.println();

		// Reinserting
		pq.offer(30);
		pq.offer(60);
		pq.offer(15);

		// Iteration does NOT follow priority order
		System.out.print("Iteration order: ");
		for (int n : pq) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
}
