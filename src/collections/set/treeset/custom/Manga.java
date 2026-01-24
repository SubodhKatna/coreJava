package collections.set.treeset.custom;

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

	// Getters for display and logic
	public String getTitle() {
		return title;
	}

	public int getTotalChapters() {
		return totalChapters;
	}

	@Override
	public String toString() {
		return String.format("%-20s | %d Ch | %s", title, totalChapters, isComplete ? "Complete" : "Ongoing");
	}

	// --- CRITICAL: The "Compass" ---
	// This method guides the Tree.
	// Negative result (< 0): "I belong to the LEFT (Smaller)"
	// Positive result (> 0): "I belong to the RIGHT (Larger)"
	// Zero (0): "I am a Duplicate (Don't add me)"
	@Override
	public int compareTo(Manga other) {
		if (this == other)
			return 0;
		int titleCompare = this.title.compareTo(other.title);
		if (titleCompare != 0)
			return titleCompare;

		// Tie-breaker: Check author if titles are identical
		return this.author.compareTo(other.author);
	}
}