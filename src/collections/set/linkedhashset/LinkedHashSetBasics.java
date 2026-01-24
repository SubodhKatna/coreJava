package collections.set.linkedhashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetBasics {

	public static void main(String[] args) {

		// 1. HashSet (No guaranteed order)
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Naruto");
		hashSet.add("One Piece");
		hashSet.add("Bleach");

		System.out.println("HashSet (Random Order):       " + hashSet);

		// 2. LinkedHashSet (Maintains insertion order)
		Set<String> linkedSet = new LinkedHashSet<>();
		linkedSet.add("Naruto");
		linkedSet.add("One Piece");
		linkedSet.add("Bleach");

		System.out.println("LinkedHashSet (Insertion Order): " + linkedSet);

		// 3. Duplicate Handling
		// Re-adding an existing element does NOTHING
		linkedSet.add("Naruto");

		System.out.println("After re-adding Naruto:         " + linkedSet);

		// 4. Basic Operations
		System.out.println("Contains Bleach? " + linkedSet.contains("Bleach"));
		linkedSet.remove("One Piece");
		System.out.println("After removal: " + linkedSet);

		// 5. Size & Empty Check
		System.out.println("Size: " + linkedSet.size());
		System.out.println("Is Empty? " + linkedSet.isEmpty());
	}
}
