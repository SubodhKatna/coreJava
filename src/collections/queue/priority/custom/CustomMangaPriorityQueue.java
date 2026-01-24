package collections.queue.priority.custom;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class CustomMangaPriorityQueue {

	private PriorityQueue<Manga> queue;

	// Default: uses Comparable (chapters based priority)
	public CustomMangaPriorityQueue() {
		this.queue = new PriorityQueue<>();
	}

	// Custom Comparator based priority
	public CustomMangaPriorityQueue(Comparator<Manga> comparator) {
		this.queue = new PriorityQueue<>(comparator);
	}

	// ---------- INSERT ----------
	public void insert(Manga manga) {
		queue.offer(manga);
	}

	// ---------- DELETE (Highest Priority) ----------
	public Manga delete() {
		return queue.poll();
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
	// Note: PriorityQueue needs rebuild after update
	public boolean updateChapters(String title, int newChapters) {
		Manga target = searchByTitle(title);
		if (target == null)
			return false;

		queue.remove(target);
		target.setTotalChapters(newChapters);
		queue.offer(target);
		return true;
	}

	public boolean updateCompletion(String title, boolean completed) {
		Manga target = searchByTitle(title);
		if (target == null)
			return false;

		queue.remove(target);
		target.setComplete(completed);
		queue.offer(target);
		return true;
	}

	// ---------- SORT / VIEW (does not destroy original queue) ----------
	public List<Manga> sortedView() {
		PriorityQueue<Manga> copy = new PriorityQueue<>(queue);
		List<Manga> result = new ArrayList<>();
		while (!copy.isEmpty()) {
			result.add(copy.poll());
		}
		return result;
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
