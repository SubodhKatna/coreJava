package collections.set.linkedhashset.custom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MangaLinkedLibrary {
	public static void main(String[] args) {

		// --- 1. SETUP RAW DATA ---
		List<Manga> rawList = new ArrayList<>();
		rawList.add(new Manga("Naruto", "Kishimoto", "Shueisha", true, 700, 72, true));
		rawList.add(new Manga("One Piece", "Oda", "Shueisha", true, 1100, 108, false));
		rawList.add(new Manga("Bleach", "Kubo", "Shueisha", true, 686, 74, true));

		// --- 2. INSERTION & PRESERVATION (LinkedHashSet Behavior) ---
		System.out.println("=== 1. Insertion & Order Preservation ===");
		CustomLinkedHashSet<Manga> libSet = new CustomLinkedHashSet<>(10);

		for (Manga m : rawList) {
			libSet.add(m);
		}
		libSet.printInsertionOrder();
		// Expected: Naruto -> One Piece -> Bleach

		// --- 3. DELETION ---
		System.out.println("\n=== 2. Deletion (Removing One Piece) ===");
		// We create a dummy object to match the Key (uses .equals())
		Manga keyToRemove = new Manga("One Piece", "Oda", null, false, 0, 0, false);
		libSet.remove(keyToRemove);

		libSet.printInsertionOrder();
		// Expected: Naruto -> Bleach

		// --- 4. UPDATION ---
		System.out.println("\n=== 3. Updation (Naruto -> Boruto) ===");
		Manga oldKey = new Manga("Naruto", "Kishimoto", null, false, 0, 0, false);
		Manga newKey = new Manga("Boruto", "Kishimoto", "Shueisha", true, 100, 10, false);

		// This removes Naruto and adds Boruto to the END of the list
		libSet.update(oldKey, newKey);

		libSet.printInsertionOrder();
		// Expected: Bleach -> Boruto (New item goes to end)

		// --- 5. SORTING with COMPARABLE & COMPARATOR ---
		System.out.println("\n=== 4. Sorting Logic ===");

		// Example A: Sort using COMPARABLE (Defined in Manga class: Title)
		Collections.sort(rawList);
		System.out.println("Sorted List (Comparable - Title): " + rawList);

		// Example B: Sort using COMPARATOR (Custom: Chapter Count)
		Comparator<Manga> chapterSorter = new Comparator<Manga>() {
			@Override
			public int compare(Manga m1, Manga m2) {
				// Descending order
				return Integer.compare(m2.getTotalChapters(), m1.getTotalChapters());
			}
		};
		Collections.sort(rawList, chapterSorter);

		// Now we put the SORTED list into the LinkedHashSet
		CustomLinkedHashSet<Manga> sortedSet = new CustomLinkedHashSet<>(10);
		for (Manga m : rawList) {
			sortedSet.add(m);
		}

		System.out.println("\n[Final Set Created from Sorted List (Chapters Desc)]");
		sortedSet.printInsertionOrder();
		// Expected: One Piece -> Naruto -> Bleach

		// Proof that buckets are still random
		sortedSet.printBuckets();
	}
}