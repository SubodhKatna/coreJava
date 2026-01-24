package collections.map.hashmap.custom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MangaMapLibrary {
	public static void main(String[] args) {
		// Start with capacity 10
		CustomHashMap<String, Manga> library = new CustomHashMap<>(10);

		// --- 1. POPULATE LIBRARY ---
		// Key: ISBN (International Standard Book Number) - Unique ID for every book
		// Value: The full Manga object
		library.put("978-1421500799", new Manga("Naruto Vol 1", "Kishimoto", "Shueisha", true, 7, 1, false));
		library.put("978-1569319017", new Manga("One Piece Vol 1", "Oda", "Shueisha", true, 8, 1, false));
		library.put("978-1612620244", new Manga("Attack on Titan 1", "Isayama", "Kodansha", true, 4, 1, false));
		library.put("978-1593070205", new Manga("Berserk Vol 1", "Miura", "Hakusensha", true, 3, 1, false));
		library.put("978-1421519180", new Manga("Bleach Vol 1", "Kubo", "Shueisha", true, 7, 1, false));
		library.put("978-1421582696", new Manga("One Punch Man 1", "ONE/Murata", "Shueisha", true, 8, 1, false));

		// Print the raw map
		System.out.println("=== FULL LIBRARY CATALOG ===");
		library.printAllData();

		// --- 2. CUSTOM FILTER: Find 'Shueisha' Manga Only ---
		System.out.println("\n=== FILTER: Publisher 'Shueisha' ===");
		List<Manga> shueishaList = new ArrayList<>();

		// Loop through all values and check condition
		for (Manga m : library.values()) {
			if (m.getPublisher().equals("Shueisha")) {
				shueishaList.add(m);
			}
		}

		for (Manga m : shueishaList) {
			System.out.println(" - " + m.getTitle());
		}

		// --- 3. CUSTOM SORT: Sort by Chapter Count (Descending) ---
		System.out.println("\n=== SORT: By Total Chapters (High to Low) ===");
		List<Manga> allManga = library.values();

		// Using a Lambda Comparator for cleaner code
		// (m1, m2) -> Integer.compare(m2.chapters, m1.chapters)
		Collections.sort(allManga, new Comparator<Manga>() {
			@Override
			public int compare(Manga m1, Manga m2) {
				return Integer.compare(m2.getTotalChapters(), m1.getTotalChapters());
			}
		});

		for (Manga m : allManga) {
			System.out.printf("%-20s : %d Chapters%n", m.getTitle(), m.getTotalChapters());
		}

		// --- 4. RETRIEVAL BY ISBN ---
		System.out.println("\n=== CHECKOUT: Searching for Specific ISBN ===");
		String searchISBN = "978-1593070205"; // Berserk
		Manga result = library.get(searchISBN);

		if (result != null) {
			System.out.println("Found Book: " + result.getTitle() + " by " + result.getAuthor());
		} else {
			System.out.println("Book not found.");
		}
	}
}