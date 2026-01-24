package collections.list.arraylist.custom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MangaLibrary {
	public static void main(String[] args) {
		// --- PART 1: Using our CustomArrayList ---
		System.out.println("--- 1. Testing CustomArrayList ---");
		CustomArrayList<Manga> myMangaList = new CustomArrayList<>();

		myMangaList.add(new Manga("One Piece", "Oda", "Shueisha", true, 1100, 108, false));
		myMangaList.add(new Manga("Naruto", "Kishimoto", "Shueisha", true, 700, 72, true));
		myMangaList.add(new Manga("Bleach", "Kubo", "Shueisha", true, 686, 74, true));
		myMangaList.add(new Manga("Attack on Titan", "Isayama", "Kodansha", true, 139, 34, true));

		// Verify Custom List works
		System.out.println("First Manga in Custom List: " + myMangaList.get(0).getTitle());
		System.out.println("Custom List Size: " + myMangaList.size());

		// --- PART 2: Moving to Standard List for Sorting Operations ---
		// (Since Collections.sort requires java.util.List, we load our data there)
		List<Manga> library = new ArrayList<>();
		for (int i = 0; i < myMangaList.size(); i++) {
			library.add(myMangaList.get(i));
		}

		// --- COMPARABLE (Natural Order defined in Manga class: Title) ---
		Collections.sort(library);
		System.out.println("\n--- 2. Sorted by Title (Comparable) ---");
		printList(library);

		// --- COMPARATOR (Custom Order: By Total Chapters) ---
		Comparator<Manga> chapterComparator = new Comparator<Manga>() {
			@Override
			public int compare(Manga m1, Manga m2) {
				// Ascending order of chapters
				return Integer.compare(m1.getTotalChapters(), m2.getTotalChapters());
			}
		};

		Collections.sort(library, chapterComparator);
		System.out.println("\n--- 3. Sorted by Chapter Count (Comparator) ---");
		printList(library);

		// --- PART 3: Fetch all Completed Manga ---
		System.out.println("\n--- 4. Fetching Completed Manga Only ---");
		List<Manga> completedManga = fetchCompletedManga(library);
		for (Manga m : completedManga) {
			System.out.println("COMPLETED: " + m.getTitle());
		}
	}

	// Logic to filter completed manga
	public static List<Manga> fetchCompletedManga(List<Manga> sourceList) {
		List<Manga> result = new ArrayList<>();
		for (Manga m : sourceList) {
			if (m.isComplete()) {
				result.add(m);
			}
		}
		return result;
	}

	// Helper to print
	private static void printList(List<Manga> list) {
		for (Manga m : list) {
			System.out.println(m);
		}
	}
}