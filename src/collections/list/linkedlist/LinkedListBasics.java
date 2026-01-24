package collections.list.linkedlist;

import java.util.LinkedList;

public class LinkedListBasics {

	public static void main(String[] args) {

		// LinkedList implements List + Deque interfaces
		// Internally uses Doubly Linked List structure
		LinkedList<String> mangaList = new LinkedList<>();

		// 1. Basic Adding (Appends at end)
		mangaList.add("Naruto");
		mangaList.add("Bleach");

		// 2. Deque-based Insertions (Efficient at ends - O(1))
		mangaList.addFirst("Dragon Ball"); // head insertion
		mangaList.addLast("One Piece"); // tail insertion

		// 3. Offer methods (Queue-style safe operations)
		mangaList.offer("Attack on Titan"); // addLast()
		mangaList.offerFirst("Demon Slayer"); // addFirst()
		mangaList.offerLast("Jujutsu Kaisen"); // addLast()

		System.out.println("Initial List: " + mangaList);

		// 4. Accessing Elements
		System.out.println("First Element: " + mangaList.getFirst()); // O(1)
		System.out.println("Last Element: " + mangaList.getLast()); // O(1)
		System.out.println("Element at index 2: " + mangaList.get(2)); // O(n)

		// 5. Checking Properties
		System.out.println("Contains 'Naruto'? " + mangaList.contains("Naruto"));
		System.out.println("Size: " + mangaList.size());
		System.out.println("Is Empty? " + mangaList.isEmpty());

		// 6. Basic Removals
		mangaList.removeFirst(); // removes head
		mangaList.removeLast(); // removes tail
		mangaList.remove("Bleach");// removes by object
		mangaList.remove(2); // removes by index

		System.out.println("After Removals: " + mangaList);

		// 7. Peek operations (safe retrieval, no removal)
		System.out.println("Peek First: " + mangaList.peekFirst());
		System.out.println("Peek Last: " + mangaList.peekLast());
	}
}
