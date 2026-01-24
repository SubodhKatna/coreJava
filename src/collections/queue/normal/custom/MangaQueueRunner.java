package collections.queue.normal.custom;

import java.util.Comparator;
import java.util.List;

public class MangaQueueRunner {

	public static void main(String[] args) {

		CustomMangaQueue queue = new CustomMangaQueue();

		// ---------- INSERT (FIFO) ----------
		queue.enqueue(new Manga("One Piece", "Oda", "Shueisha", true, 1100, 108, false));
		queue.enqueue(new Manga("Naruto", "Kishimoto", "Shueisha", true, 700, 72, true));
		queue.enqueue(new Manga("Bleach", "Kubo", "Shueisha", true, 686, 74, true));
		queue.enqueue(new Manga("Death Note", "Ohba", "Shueisha", true, 108, 12, true));

		// ---------- PEEK ----------
		System.out.println("Peek (Head): " + queue.peek());

		// ---------- SORT (Comparable) ----------
		System.out.println("\n=== Sorted by Chapters (Comparable) ===");
		List<Manga> sortedNatural = queue.sortedView();
		sortedNatural.forEach(System.out::println);

		// ---------- SORT (Comparator) ----------
		Comparator<Manga> completedThenVolumes = (m1, m2) -> {
			int c = Boolean.compare(m2.isComplete(), m1.isComplete());
			if (c != 0)
				return c;
			return Integer.compare(m2.getTotalVolumes(), m1.getTotalVolumes());
		};

		System.out.println("\n=== Sorted by Complete → Volumes ===");
		queue.sortedView(completedThenVolumes).forEach(System.out::println);

		// ---------- SEARCH ----------
		System.out.println("\n=== Search ===");
		System.out.println(queue.searchByTitle("Naruto"));

		// ---------- UPDATE ----------
		System.out.println("\n=== Update Naruto Chapters ===");
		queue.updateChapters("Naruto", 750);
		queue.sortedView().forEach(System.out::println);

		// ---------- DELETE (FIFO) ----------
		System.out.println("\n=== Dequeue ===");
		System.out.println("Removed: " + queue.dequeue());

		// ---------- FINAL STATE ----------
		System.out.println("\n=== Final Queue State ===");
		queue.sortedView().forEach(System.out::println);
	}
}
