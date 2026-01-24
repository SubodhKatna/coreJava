package collections.queue.priority;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueAdvanced {

	public static void main(String[] args) {

		// Max-Heap using Comparator
		Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

		maxHeap.offer(10);
		maxHeap.offer(40);
		maxHeap.offer(30);
		maxHeap.offer(20);

		System.out.println("MaxHeap Peek: " + maxHeap.peek()); // 40

		System.out.print("Processing MaxHeap: ");
		while (!maxHeap.isEmpty()) {
			System.out.print(maxHeap.poll() + " ");
		}
		// Output: 40 30 20 10
		System.out.println();
	}
}
