package collections.queue.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeBasics {

	public static void main(String[] args) {

		/*
		 * Deque characteristics: - Insert/remove at BOTH ends - No index-based access -
		 * Can act as Queue or Stack - ArrayDeque is preferred
		 */

		Deque<String> deque = new ArrayDeque<>();

		// 1. Insert elements
		deque.addFirst("Front-1");
		deque.addLast("Back-1");
		deque.addFirst("Front-2");
		deque.addLast("Back-2");

		System.out.println("Deque: " + deque);

		// 2. Access elements
		System.out.println("First: " + deque.getFirst());
		System.out.println("Last: " + deque.getLast());

		// 3. Remove elements
		System.out.println("Removed First: " + deque.removeFirst());
		System.out.println("Removed Last: " + deque.removeLast());

		System.out.println("After removals: " + deque);
	}
}
