package collections.list.arraylist.custom;

// We implement Comparable to define the "default" sorting (by Title)
public class Manga implements Comparable<Manga> {
	private String title;
	private String author;
	private String publisher;
	private boolean isAdapted; // isAddepted
	private int totalChapters;
	private int totalVolumes; // totalVoilume
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

	// Getters needed for Comparators and filtering
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getTotalChapters() {
		return totalChapters;
	}

	public boolean isComplete() {
		return isComplete;
	}

	@Override
	public String toString() {
		return String.format("Manga{title='%s', author='%s', chapters=%d, complete=%s}", title, author, totalChapters,
				isComplete);
	}

	// NATURAL ORDER: Sort by Title alphabetically
	@Override
	public int compareTo(Manga other) {
		return this.title.compareTo(other.title);
	}
}