package collections.list.linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListAdvanced {

	public static void main(String[] args) {

		LinkedList<String> history = new LinkedList<>();

		// =========================
		// 1. Stack Behavior (LIFO)
		// =========================
		history.push("Home Page"); // addFirst()
		history.push("Settings");
		history.push("Profile");
		history.push("Security");

		System.out.println("Stack (LIFO): " + history);

		// pop() = removeFirst()
		String lastVisited = history.pop();
		System.out.println("Popped: " + lastVisited);
		System.out.println("After pop(): " + history);

		// peek() = getFirst() but safe
		System.out.println("Peek Stack Top: " + history.peek());

		// =========================
		// 2. Queue Behavior (FIFO)
		// =========================
		history.offer("Dashboard"); // addLast()
		history.offer("Reports");

		System.out.println("Queue State: " + history);

		String served = history.poll(); // removeFirst()
		System.out.println("Served (FIFO): " + served);
		System.out.println("After poll(): " + history);

		// =========================
		// 3. Deque Operations
		// =========================
		history.addFirst("Login");
		history.addLast("Logout");

		System.out.println("Deque Structure: " + history);

		// =========================
		// 4. Bulk Operations
		// =========================
		LinkedList<String> extra = new LinkedList<>(Arrays.asList("Help", "About"));

		history.addAll(extra);
		System.out.println("After addAll(): " + history);

		history.removeAll(Arrays.asList("Help"));
		System.out.println("After removeAll(): " + history);

		history.retainAll(Arrays.asList("Login", "Dashboard", "Reports"));
		System.out.println("After retainAll(): " + history);

		// =========================
		// 5. Sorting
		// =========================
		Collections.sort(history);
		System.out.println("Sorted: " + history);

		Collections.reverse(history);
		System.out.println("Reversed: " + history);

		// =========================
		// 6. Conversion
		// =========================
		Object[] objectArray = history.toArray();
		System.out.println("Object Array Size: " + objectArray.length);

		String[] stringArray = history.toArray(new String[0]);
		System.out.println("String Array: " + Arrays.toString(stringArray));

		// =========================
		// 7. Copy Constructor
		// =========================
		List<String> copiedList = new LinkedList<>(history);
		System.out.println("Copied List: " + copiedList);
	}
}
