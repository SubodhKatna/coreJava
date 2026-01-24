package collections.set.treeset.custom;

import java.util.Comparator;

public class MangaTreeLibrary {
	public static void main(String[] args) {

		// ==========================================
		// PART A: Testing our CUSTOM Implementation
		// ==========================================
		System.out.println("--- PART A: CustomTreeSet Operations ---");
		CustomTreeSet<Manga> myTree = new CustomTreeSet<>();

		// 1. Adding Data (Notice we add them out of order)
		myTree.add(new Manga("Naruto", "Kishimoto", "Shueisha", true, 700, 72, true));
		myTree.add(new Manga("Bleach", "Kubo", "Shueisha", true, 686, 74, true));
		myTree.add(new Manga("One Piece", "Oda", "Shueisha", true, 1100, 108, false));
		myTree.add(new Manga("Attack on Titan", "Isayama", "Kodansha", true, 139, 34, true));

		// 2. Traversal
		// The tree uses 'compareTo' (Title) to sort these automatically
		System.out.println("\n[Sorted Output]");
		myTree.printSorted();

		// 3. Navigation
		System.out.println("\n[Navigation Check]");
		System.out.println("First (Alphabetical): " + myTree.first().getTitle()); // Should be Attack on Titan
		System.out.println("Last (Alphabetical):  " + myTree.last().getTitle()); // Should be One Piece

		// 4. Search
		Manga searchKey = new Manga("Naruto", "Kishimoto", "Shueisha", true, 700, 72, true);
		System.out.println("Contains Naruto? " + myTree.contains(searchKey));

		// ==========================================
		// PART B: Standard Java TreeSet (Advanced)
		// ==========================================
		System.out.println("\n\n--- PART B: Standard Java TreeSet (Comparators & Iterators) ---");

		// 1. Custom Comparator: Sort by Chapter Count (Descending)
		// We override the default 'compareTo' behavior here
		Comparator<Manga> chapterSorter = new Comparator<Manga>() {
			@Override
			public int compare(Manga m1, Manga m2) {
				return Integer.compare(m2.getTotalChapters(), m1.getTotalChapters());
			}
		};

	}
}