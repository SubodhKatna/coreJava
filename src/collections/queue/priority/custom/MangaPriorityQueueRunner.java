package collections.queue.priority.custom;

import java.util.Comparator;
import java.util.List;

public class MangaPriorityQueueRunner {

	public static void main(String[] args) {

		// ---------- CUSTOM COMPARATOR ----------
		// Completed manga first, then higher chapters
		Comparator<Manga> completedThenChapters = (m1, m2) -> {
			int c = Boolean.compare(m2.isComplete(), m1.isComplete());
			if (c != 0)
				return c;
			return Integer.compare(m2.getTotalChapters(), m1.getTotalChapters());
		};

		CustomMangaPriorityQueue pq = new CustomMangaPriorityQueue(completedThenChapters);

		// ---------- INSERT ----------
		pq.insert(new Manga("One Piece", "Oda", "Shueisha", true, 1100, 108, false));
		pq.insert(new Manga("Naruto", "Kishimoto", "Shueisha", true, 700, 72, true));
		pq.insert(new Manga("Bleach", "Kubo", "Shueisha", true, 686, 74, true));
		pq.insert(new Manga("Death Note", "Ohba", "Shueisha", true, 108, 12, true));

		// ---------- SORT / VIEW ----------
		System.out.println("=== Sorted View ===");
		List<Manga> sorted = pq.sortedView();
		for (Manga m : sorted) {
			System.out.println(m);
		}

		// ---------- SEARCH ----------
		System.out.println("\n=== Search ===");
		Manga found = pq.searchByTitle("Naruto");
		System.out.println(found);

		// ---------- UPDATE ----------
		System.out.println("\n=== Update Chapters (Naruto -> 750) ===");
		pq.updateChapters("Naruto", 750);
		pq.sortedView().forEach(System.out::println);

		// ---------- DELETE ----------
		System.out.println("\n=== Delete Highest Priority ===");
		System.out.println("Removed: " + pq.delete());

		// ---------- FINAL STATE ----------
		System.out.println("\n=== Final Queue State ===");
		pq.sortedView().forEach(System.out::println);
	}
}
