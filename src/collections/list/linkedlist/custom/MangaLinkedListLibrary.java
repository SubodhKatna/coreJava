package collections.list.linkedlist.custom;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MangaLinkedListLibrary {
	public static void main(String[] args) {
		// 1. Using our Custom Linked List
		System.out.println("--- 1. Custom Linked List Operations ---");
		CustomLinkedList<Manga> customLib = new CustomLinkedList<>();
		customLib.add(new Manga("Berserk", "Miura", "Hakusensha", true, 364, 41, false));
		customLib.addFirst(new Manga("Vagabond", "Inoue", "Kodansha", false, 327, 37, false));

		customLib.printList();

		// 2. Using Standard LinkedList for Sorting logic
		// (We load data from our custom list into a standard LinkedList)
		LinkedList<Manga> library = new LinkedList<>(customLib.toJavaUtilList());
		library.add(new Manga("Naruto", "Kishimoto", "Shueisha", true, 700, 72, true));
		library.add(new Manga("Demon Slayer", "Gotouge", "Shueisha", true, 205, 23, true));

		// Sort by Title (Comparable)
		Collections.sort(library);
		System.out.println("\n--- 2. Sorted by Title (Comparable) ---");
		printList(library);

		// Sort by Chapters (Comparator)
		Collections.sort(library, new Comparator<Manga>() {
			@Override
			public int compare(Manga m1, Manga m2) {
				return Integer.compare(m1.getTotalChapters(), m2.getTotalChapters());
			}
		});
		System.out.println("\n--- 3. Sorted by Chapters (Comparator) ---");
		printList(library);

		// 3. Filter Completed
		System.out.println("\n--- 4. Completed Manga Only ---");
		List<Manga> completed = fetchCompleted(library);
		for (Manga m : completed) {
			System.out.println("COMPLETED: " + m.getTitle());
		}
	}

	// Logic to filter completed manga
	public static List<Manga> fetchCompleted(List<Manga> list) {
		List<Manga> result = new LinkedList<>();
		for (Manga m : list) {
			if (m.isComplete()) {
				result.add(m);
			}
		}
		return result;
	}

	private static void printList(List<Manga> list) {
		for (Manga m : list) {
			System.out.println(m);
		}
	}
}