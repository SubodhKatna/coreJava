package collections.queue.normal.custom;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Queue;

public class CustomMangaQueue {

	// FIFO queue
	private Queue<Manga> queue = new ArrayDeque<>();

	// ---------- INSERT (ENQUEUE) ----------
	public void enqueue(Manga manga) {
		queue.offer(manga);
	}

	// ---------- DELETE (DEQUEUE) ----------
	public Manga dequeue() {
		return queue.poll();
	}

	// ---------- PEEK ----------
	public Manga peek() {
		return queue.peek();
	}

	// ---------- SEARCH ----------
	public Manga searchByTitle(String title) {
		for (Manga m : queue) {
			if (m.getTitle().equalsIgnoreCase(title)) {
				return m;
			}
		}
		return null;
	}

	// ---------- UPDATE ----------
	// FIFO order preserved (no rebuild needed)
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
	// Queue itself is NOT sorted; return sorted copy
	public List<Manga> sortedView() {
		List<Manga> list = new ArrayList<>(queue);
		list.sort(null); // uses Comparable
		return list;
	}

	public List<Manga> sortedView(Comparator<Manga> comparator) {
		List<Manga> list = new ArrayList<>(queue);
		list.sort(comparator);
		return list;
	}

	// ---------- SIZE ----------
	public int size() {
		return queue.size();
	}

	// ---------- CLEAR ----------
	public void clear() {
		queue.clear();
	}
}
