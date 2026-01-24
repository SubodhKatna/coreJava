package collections.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetBasics {

	public static void main(String[] args) {

		// 1. Creation
		// HashSet implements Set interface
		// Does NOT maintain insertion order
		// Does NOT allow duplicates
		Set<String> publishers = new HashSet<>();

		// 2. Adding Elements
		publishers.add("Shueisha");
		publishers.add("Kodansha");
		publishers.add("Shueisha"); // Duplicate - ignored
		publishers.add("Hakusensha");

		System.out.println("Publishers Set: " + publishers);

		// 3. Size of Set
		System.out.println("Size: " + publishers.size());

		// 4. Checking Existence (Very fast - O(1) average)
		System.out.println("Contains Kodansha? " + publishers.contains("Kodansha"));
		System.out.println("Contains Viz? " + publishers.contains("Viz"));

		// 5. Removal
		publishers.remove("Hakusensha");
		System.out.println("After Removal: " + publishers);

		// 6. Iteration
		System.out.print("Iterating Set: ");
		for (String publisher : publishers) {
			System.out.print(publisher + " ");
		}
		System.out.println();

		// 7. Empty Check
		System.out.println("Is Empty? " + publishers.isEmpty());

		// 8. Clear Set
		publishers.clear();
		System.out.println("After clear(), size: " + publishers.size());
	}
}
