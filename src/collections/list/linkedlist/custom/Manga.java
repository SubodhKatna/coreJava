package collections.list.linkedlist.custom;

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

	public String getTitle() {
		return title;
	}

	public int getTotalChapters() {
		return totalChapters;
	}

	public boolean isComplete() {
		return isComplete;
	}

	@Override
	public String toString() {
		return "Manga{title='" + title + "', chapters=" + totalChapters + ", complete=" + isComplete + "}";
	}

	@Override
	public int compareTo(Manga other) {
		return this.title.compareTo(other.title);
	}
}