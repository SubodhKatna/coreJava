package collections.queue.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeAdvanced {

	public static void main(String[] args) {

		Deque<Integer> numbers = new ArrayDeque<>();
		numbers.offer(10);
		numbers.offer(20);
		numbers.offer(30);
		numbers.offer(40);

		// 1. Descending iteration
		System.out.print("Reverse Order: ");
		Iterator<Integer> it = numbers.descendingIterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();

		// 2. Clear
		numbers.clear();
		System.out.println("After clear, is empty? " + numbers.isEmpty());
	}
}
