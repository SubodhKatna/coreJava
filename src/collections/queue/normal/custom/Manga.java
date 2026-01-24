package collections.queue.normal.custom;

public class Manga implements Comparable<Manga> {

	private String title;
	private String author;
	private String publisher;
	private boolean isAdapted;
	private int totalChapters;
	private int totalVolumes;
	private boolean isComplete;

	public Manga(String title, String author, String publisher, boolean isAdapted, int totalChapters, int totalVolumes,
			boolean isComplete) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.isAdapted = isAdapted;
		this.totalChapters = totalChapters;
		this.totalVolumes = totalVolumes;
		this.isComplete = isComplete;
	}

	// ---------- Getters ----------
	public String getTitle() {
		return title;
	}

	public int getTotalChapters() {
		return totalChapters;
	}

	public int getTotalVolumes() {
		return totalVolumes;
	}

	public boolean isAdapted() {
		return isAdapted;
	}

	public boolean isComplete() {
		return isComplete;
	}

	// ---------- Setters (for update) ----------
	public void setTotalChapters(int totalChapters) {
		this.totalChapters = totalChapters;
	}

	public void setComplete(boolean complete) {
		this.isComplete = complete;
	}

	// ---------- Custom Methods ----------
	public boolean isLongRunning() {
		return totalChapters > 500;
	}

	public boolean isPopular() {
		return isAdapted && totalVolumes > 20;
	}

	// ---------- Comparable (used only for sorting views) ----------
	@Override
	public int compareTo(Manga other) {
		return Integer.compare(this.totalChapters, other.totalChapters);
	}

	@Override
	public String toString() {
		return title + " | Chapters=" + totalChapters + " | Volumes=" + totalVolumes + " | Adapted=" + isAdapted
				+ " | Complete=" + isComplete;
	}
}
