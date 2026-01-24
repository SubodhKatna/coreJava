package collections.queue.deque.custom;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;

public class CustomMangaDeque {

	private Deque<Manga> deque = new ArrayDeque<>();

	// ---------- INSERT ----------
	public void addFirst(Manga manga) {
		deque.offerFirst(manga);
	}

	public void addLast(Manga manga) {
		deque.offerLast(manga);
	}

	// ---------- DELETE ----------
	public Manga removeFirst() {
		return deque.pollFirst();
	}

	public Manga removeLast() {
		return deque.pollLast();
	}

	// ---------- SEARCH ----------
	public Manga searchByTitle(String title) {
		for (Manga m : deque) {
			if (m.getTitle().equalsIgnoreCase(title)) {
				return m;
			}
		}
		return null;
	}

	// ---------- UPDATE ----------
	public boolean updateChapters(String title, int newChapters) {
		Manga target = searchByTitle(title);
		if (target == null)
			return false;
		target.setTotalChapters(newChapters);
		return true;
	}

	public boolean updateCompletion(String title, boolean completed) {
		Manga target = searchByTitle(title);
		if (target == null)
			return false;
		target.setComplete(completed);
		return true;
	}

	// ---------- SORT / VIEW ----------
	// Deque itself is NOT sorted, so we return a sorted copy
	public List<Manga> sortedView() {
		List<Manga> list = new ArrayList<>(deque);
		list.sort(null); // uses Comparable
		return list;
	}

	public List<Manga> sortedView(Comparator<Manga> comparator) {
		List<Manga> list = new ArrayList<>(deque);
		list.sort(comparator);
		return list;
	}

	// ---------- SIZE ----------
	public int size() {
		return deque.size();
	}

	// ---------- CLEAR ----------
	public void clear() {
		deque.clear();
	}
}
