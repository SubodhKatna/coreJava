package collections.queue.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeIntermediate {

	public static void main(String[] args) {

		Deque<String> deque = new ArrayDeque<>();

		// 1. Safe insertions
		deque.offerFirst("A");
		deque.offerLast("B");
		deque.offerFirst("C");

		System.out.println("Deque: " + deque);

		// 2. Safe access
		System.out.println("Peek First: " + deque.peekFirst());
		System.out.println("Peek Last: " + deque.peekLast());

		// 3. Safe removals
		System.out.println("Poll First: " + deque.pollFirst());
		System.out.println("Poll Last: " + deque.pollLast());

		System.out.println("After polling: " + deque);

		// 4. Iteration
		System.out.print("Iterating Deque: ");
		for (String val : deque) {
			System.out.print(val + " ");
		}
		System.out.println();
	}
}
