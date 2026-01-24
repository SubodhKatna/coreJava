package collections.set.linkedhashset;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetIntermediate {

	public static void main(String[] args) {

		Set<String> mangaSet = new LinkedHashSet<>(Arrays.asList("Naruto", "One Piece", "Bleach", "Dragon Ball"));

		System.out.println("Initial Set: " + mangaSet);

		// 1. Iteration (Preserves insertion order)
		System.out.print("Iterating: ");
		for (String manga : mangaSet) {
			System.out.print(manga + " ");
		}
		System.out.println();

		// 2. Iterator usage
		Iterator<String> iterator = mangaSet.iterator();
		System.out.print("Iterator Traversal: ");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();

		// 3. Bulk Operations
		Set<String> newManga = new LinkedHashSet<>(Arrays.asList("Bleach", "Jujutsu Kaisen"));

		mangaSet.addAll(newManga);
		System.out.println("After addAll: " + mangaSet);

		mangaSet.removeAll(Arrays.asList("Naruto"));
		System.out.println("After removeAll: " + mangaSet);

		mangaSet.retainAll(Arrays.asList("Bleach", "One Piece"));
		System.out.println("After retainAll: " + mangaSet);

		// 4. Conversion to Array
		Object[] objArray = mangaSet.toArray();
		System.out.println("Object Array length: " + objArray.length);

		String[] strArray = mangaSet.toArray(new String[0]);
		System.out.println("String Array: " + Arrays.toString(strArray));
	}
}
