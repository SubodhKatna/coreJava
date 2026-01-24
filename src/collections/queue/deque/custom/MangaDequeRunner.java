package collections.queue.deque.custom;

import java.util.Comparator;
import java.util.List;

public class MangaDequeRunner {

	public static void main(String[] args) {

		CustomMangaDeque deque = new CustomMangaDeque();

		// ---------- INSERT ----------
		deque.addLast(new Manga("One Piece", "Oda", "Shueisha", true, 1100, 108, false));
		deque.addLast(new Manga("Naruto", "Kishimoto", "Shueisha", true, 700, 72, true));
		deque.addFirst(new Manga("Bleach", "Kubo", "Shueisha", true, 686, 74, true));
		deque.addLast(new Manga("Death Note", "Ohba", "Shueisha", true, 108, 12, true));

		// ---------- SORT (Comparable) ----------
		System.out.println("=== Sorted by Chapters (Comparable) ===");
		List<Manga> sortedNatural = deque.sortedView();
		sortedNatural.forEach(System.out::println);

		// ---------- SORT (Comparator) ----------
		Comparator<Manga> completedThenVolumes = (m1, m2) -> {
			int c = Boolean.compare(m2.isComplete(), m1.isComplete());
			if (c != 0)
				return c;
			return Integer.compare(m2.getTotalVolumes(), m1.getTotalVolumes());
		};

		System.out.println("\n=== Sorted by Complete → Volumes ===");
		deque.sortedView(completedThenVolumes).forEach(System.out::println);

		// ---------- SEARCH ----------
		System.out.println("\n=== Search ===");
		System.out.println(deque.searchByTitle("Naruto"));

		// ---------- UPDATE ----------
		System.out.println("\n=== Update Naruto Chapters ===");
		deque.updateChapters("Naruto", 750);
		deque.sortedView().forEach(System.out::println);

		// ---------- DELETE ----------
		System.out.println("\n=== Remove First ===");
		System.out.println(deque.removeFirst());

		System.out.println("\n=== Remove Last ===");
		System.out.println(deque.removeLast());

		// ---------- FINAL STATE ----------
		System.out.println("\n=== Final Deque State ===");
		deque.sortedView().forEach(System.out::println);
	}
}
