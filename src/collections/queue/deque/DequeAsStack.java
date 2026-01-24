package collections.queue.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeAsStack {

	public static void main(String[] args) {

		Deque<String> stack = new ArrayDeque<>();

		// Push (top)
		stack.push("Page 1");
		stack.push("Page 2");
		stack.push("Page 3");

		System.out.println("Stack: " + stack);

		// Pop
		System.out.println("Pop: " + stack.pop());
		System.out.println("After pop: " + stack);

		// Peek
		System.out.println("Peek: " + stack.peek());
	}
}
