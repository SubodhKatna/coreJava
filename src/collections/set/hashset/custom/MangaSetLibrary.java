package collections.set.hashset.custom;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MangaSetLibrary {
	public static void main(String[] args) {

		// 1. Create Custom Set & Add Data
		CustomHashSet<Manga> library = new CustomHashSet<>(10);

		library.add(new Manga("One Piece", "Oda", "Shueisha", true, 1100, 108, false));
		library.add(new Manga("Naruto", "Kishimoto", "Shueisha", true, 700, 72, true));
		library.add(new Manga("Bleach", "Kubo", "Shueisha", true, 686, 74, true));
		library.add(new Manga("Attack on Titan", "Isayama", "Kodansha", true, 139, 34, true));
		library.add(new Manga("Naruto", "Kishimoto", "Shueisha", true, 700, 72, true)); // Duplicate!

		System.out.println("--- 1. Set Storage (Unordered / Buckets) ---");
		library.printBuckets(); // Shows how they are scattered

		// --- TRANSITION: Set -> List ---
		// Sets cannot be sorted. We must convert to List first.
		List<Manga> sortableList = library.toList();

		// --- 2. Sorting with COMPARABLE (Natural Order: Title) ---
		Collections.sort(sortableList);

		System.out.println("\n--- 2. Sorted by Title (Comparable) ---");
		printList(sortableList);

		// --- 3. Sorting with COMPARATOR (Custom Order: Chapters) ---
		// We use the large fields you created here
		Comparator<Manga> chapterComparator = new Comparator<Manga>() {
			@Override
			public int compare(Manga m1, Manga m2) {
				// High to Low (Descending)
				return Integer.compare(m2.getTotalChapters(), m1.getTotalChapters());
			}
		};

		Collections.sort(sortableList, chapterComparator);
		System.out.println("\n--- 3. Sorted by Chapters Descending (Comparator) ---");
		printList(sortableList);

		// --- 4. Sorting with COMPARATOR (Custom Order: Volumes) ---
		Collections.sort(sortableList, new Comparator<Manga>() {
			@Override
			public int compare(Manga m1, Manga m2) {
				return Integer.compare(m1.getTotalVolumes(), m2.getTotalVolumes());
			}
		});
		System.out.println("\n--- 4. Sorted by Volumes Ascending (Comparator) ---");
		printList(sortableList);
	}

	private static void printList(List<Manga> list) {
		for (Manga m : list) {
			System.out.println(m);
		}
	}
}