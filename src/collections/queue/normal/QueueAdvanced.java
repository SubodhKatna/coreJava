package collections.queue.normal;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueAdvanced {

	public static void main(String[] args) {

		// ArrayDeque is the BEST general-purpose Queue
		Queue<Integer> jobQueue = new ArrayDeque<>();

		// 1. Insert jobs
		jobQueue.offer(101);
		jobQueue.offer(102);
		jobQueue.offer(103);

		System.out.println("Job Queue: " + jobQueue);

		// 2. Process jobs
		while (!jobQueue.isEmpty()) {
			int job = jobQueue.poll();
			System.out.println("Processing Job: " + job);
		}

		// 3. Safe empty behavior
		System.out.println("Poll on empty queue: " + jobQueue.poll());
		System.out.println("Peek on empty queue: " + jobQueue.peek());
	}
}
