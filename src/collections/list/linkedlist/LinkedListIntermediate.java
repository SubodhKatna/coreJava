package collections.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIntermediate {

	public static void main(String[] args) {

		LinkedList<String> stack = new LinkedList<>();

		// 1. Adding Elements
		stack.add("Page 1");
		stack.add("Page 2");
		stack.add("Page 3");
		stack.add("Page 4");
		stack.add("Page 5");

		System.out.println("Original List: " + stack);

		// 2. Reverse Iteration (Descending Iterator)
		System.out.print("Reverse Order: ");
		Iterator<String> reverseIt = stack.descendingIterator();
		while (reverseIt.hasNext()) {
			System.out.print(reverseIt.next() + " -> ");
		}
		System.out.println("START");

		// 3. Forward ListIterator (Bidirectional traversal)
		ListIterator<String> listIterator = stack.listIterator();
		System.out.print("Forward: ");
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + " ");
		}
		System.out.println();

		System.out.print("Backward: ");
		while (listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + " ");
		}
		System.out.println();

		// 4. Queue Operations (FIFO behavior)
		System.out.println("Peek Head (no remove): " + stack.peek()); // null if empty
		System.out.println("Poll Head (remove): " + stack.poll()); // null if empty

		System.out.println("After poll(): " + stack);

		// 5. Search Operations
		System.out.println("Contains 'Page 3'? " + stack.contains("Page 3"));
		System.out.println("Index of 'Page 4': " + stack.indexOf("Page 4"));

		// 6. Conditional Removal (Lambda)
		stack.removeIf(page -> page.endsWith("5"));
		System.out.println("After removeIf(): " + stack);

		// 7. Clear
		stack.clear();
		System.out.println("After clear(), is empty? " + stack.isEmpty());
	}
}
