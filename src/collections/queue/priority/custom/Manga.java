package collections.queue.priority.custom;

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

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public boolean isAdapted() {
		return isAdapted;
	}

	public int getTotalChapters() {
		return totalChapters;
	}

	public int getTotalVolumes() {
		return totalVolumes;
	}

	public boolean isComplete() {
		return isComplete;
	}

	// ---------- Setters (for update) ----------
	public void setTotalChapters(int totalChapters) {
		this.totalChapters = totalChapters;
	}

	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}

	// ---------- Custom Methods ----------
	public boolean isLongRunning() {
		return totalChapters > 500;
	}

	public boolean isPopular() {
		return isAdapted && totalVolumes > 20;
	}

	// ---------- Comparable (Natural Priority) ----------
	// Higher chapters = higher priority
	@Override
	public int compareTo(Manga other) {
		return Integer.compare(other.totalChapters, this.totalChapters);
	}

	@Override
	public String toString() {
		return title + " | Chapters=" + totalChapters + " | Volumes=" + totalVolumes + " | Adapted=" + isAdapted
				+ " | Complete=" + isComplete;
	}
}
