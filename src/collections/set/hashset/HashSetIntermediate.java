package collections.set.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIntermediate {

	public static void main(String[] args) {

		Set<String> groupA = new HashSet<>(Arrays.asList("Naruto", "One Piece", "Bleach"));

		Set<String> groupB = new HashSet<>(Arrays.asList("One Piece", "Dragon Ball", "Naruto"));

		System.out.println("Group A: " + groupA);
		System.out.println("Group B: " + groupB);

		// 1. Union (A ∪ B)
		Set<String> union = new HashSet<>(groupA);
		union.addAll(groupB);
		System.out.println("Union: " + union);

		// 2. Intersection (A ∩ B)
		Set<String> intersection = new HashSet<>(groupA);
		intersection.retainAll(groupB);
		System.out.println("Intersection: " + intersection);

		// 3. Difference (A − B)
		Set<String> difference = new HashSet<>(groupA);
		difference.removeAll(groupB);
		System.out.println("Difference (A - B): " + difference);

		// 4. Iteration using Iterator
		System.out.print("Iterator Traversal: ");
		Iterator<String> iterator = union.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();

		// 5. removeIf() with Predicate
		union.removeIf(name -> name.startsWith("D"));
		System.out.println("After removeIf(): " + union);
	}
}
