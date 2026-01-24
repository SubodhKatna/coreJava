package collections.set.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetIntermediate {

	public static void main(String[] args) {

		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(10);
		scores.add(25);
		scores.add(40);
		scores.add(60);
		scores.add(80);

		System.out.println("Scores: " + scores);

		// 1. Navigation Methods (Closest matches)

		// strictly less than
		System.out.println("Lower than 40: " + scores.lower(40)); // 25

		// less than or equal to
		System.out.println("Floor of 40: " + scores.floor(40)); // 40
		System.out.println("Floor of 30: " + scores.floor(30)); // 25

		// strictly greater than
		System.out.println("Higher than 40: " + scores.higher(40)); // 60

		// greater than or equal to
		System.out.println("Ceiling of 40: " + scores.ceiling(40)); // 40
		System.out.println("Ceiling of 45: " + scores.ceiling(45)); // 60

		// 2. Polling (Retrieve + Remove)
		System.out.println("Poll First (Lowest): " + scores.pollFirst());
		System.out.println("Poll Last (Highest): " + scores.pollLast());
		System.out.println("Remaining Scores: " + scores);

		// 3. Iteration (Always Sorted)
		System.out.print("Iterating TreeSet: ");
		Iterator<Integer> iterator = scores.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
	}
}
