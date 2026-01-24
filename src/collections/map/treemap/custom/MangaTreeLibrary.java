package collections.map.treemap.custom;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MangaTreeLibrary {
	public static void main(String[] args) {

		// Key: String (ISBN), Value: Manga
		CustomTreeMap<String, Manga> library = new CustomTreeMap<>();

		System.out.println("=== 1. POPULATING TREE (Random Insertion) ===");
		// Note: ISBNs are strings, so they sort alphabetically/numerically
		library.put("ISBN-900", new Manga("One Piece", "Oda", "Shueisha", true, 1100, 108, false));
		library.put("ISBN-100", new Manga("Naruto", "Kishimoto", "Shueisha", true, 700, 72, true));
		library.put("ISBN-500", new Manga("Bleach", "Kubo", "Shueisha", true, 686, 74, true));
		library.put("ISBN-300", new Manga("Berserk", "Miura", "Hakusensha", true, 364, 41, false));

		// The Tree Logic will automatically rearrange these nodes based on Key (ISBN)
		library.printMapSorted();
		// Expected Order: 100 -> 300 -> 500 -> 900

		// --- CUSTOM FILTER & SORT ---
		System.out.println("\n=== 2. CUSTOM FILTER: Completed Manga Only ===");
		List<Manga> allManga = library.values();

		for (Manga m : allManga) {
			if (m.isComplete()) {
				System.out.println("[Complete]: " + m.getTitle());
			}
		}

		System.out.println("\n=== 3. CUSTOM SORT: By Chapter Count (Comparator) ===");
		// We extract the list and apply a Comparator
		// Note: The MAP is sorted by Key (ISBN).
		// The LIST we just extracted can be sorted by whatever we want (Value fields).

		Collections.sort(allManga, new Comparator<Manga>() {
			@Override
			public int compare(Manga m1, Manga m2) {
				// Descending order (High -> Low)
				return Integer.compare(m2.getTotalChapters(), m1.getTotalChapters());
			}
		});

		for (Manga m : allManga) {
			System.out.printf("%-20s : %d Chapters%n", m.getTitle(), m.getTotalChapters());
		}
	}
}