package collections.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIntermediate {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();

		// 1. Adding Elements
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);

		System.out.println("Original List: " + numbers);

		// 2. Modify Element
		numbers.set(1, 99); // replaces 20 with 99
		System.out.println("After set(): " + numbers);

		// 3. Search Operations
		System.out.println("Contains 30? " + numbers.contains(30));
		System.out.println("Index of 50: " + numbers.indexOf(50));
		System.out.println("Last Index of 99: " + numbers.lastIndexOf(99));

		// 4. Iteration Techniques

		// Enhanced for loop
		System.out.print("For-each Loop: ");
		for (Integer num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println();

		// Traditional for loop
		System.out.print("For Loop: ");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i) + " ");
		}
		System.out.println();

		// Iterator (safe removal)
		Iterator<Integer> iterator = numbers.iterator();
		System.out.print("Iterator Loop: ");
		while (iterator.hasNext()) {
			Integer value = iterator.next();
			System.out.print(value + " ");
		}
		System.out.println();

		// 5. Remove using condition
		numbers.removeIf(num -> num > 40);
		System.out.println("After removeIf (>40): " + numbers);

		// 6. Clear List
		numbers.clear();
		System.out.println("After clear(), is empty? " + numbers.isEmpty());
	}
}
