package collections.set.treeset;

import java.util.TreeSet;

public class TreeSetBasics {

	public static void main(String[] args) {

		// TreeSet stores elements in sorted (ascending) order
		// Uses natural ordering or Comparator
		// Does NOT allow duplicates
		// Does NOT allow null elements

		TreeSet<Integer> numbers = new TreeSet<>();

		// 1. Adding Elements (Insertion order does NOT matter)
		numbers.add(50);
		numbers.add(10);
		numbers.add(30);
		numbers.add(10); // Duplicate ignored

		// 2. Automatic Sorting
		System.out.println("Sorted Set: " + numbers); // [10, 30, 50]

		// 3. Basic Access
		System.out.println("First (Lowest): " + numbers.first());
		System.out.println("Last (Highest): " + numbers.last());

		// 4. Checking Existence
		System.out.println("Contains 30? " + numbers.contains(30));
		System.out.println("Contains 99? " + numbers.contains(99));

		// 5. Removal
		numbers.remove(30);
		System.out.println("After Remove: " + numbers);

		// 6. Size and Empty Check
		System.out.println("Size: " + numbers.size());
		System.out.println("Is Empty? " + numbers.isEmpty());
	}
}
