package collections.set.linkedhashset.custom;

import java.util.Objects;

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

	// Getters needed for sorting logic
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

	// --- 1. UNIQUENESS (Required for Set) ---
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Manga manga = (Manga) o;
		return Objects.equals(title, manga.title) && Objects.equals(author, manga.author);
	}

	@Override
	public int hashCode() {
		return Objects.hash(title, author);
	}

	// --- 2. SORTING (Required for Comparable) ---
	// Default sort: Alphabetical by Title
	@Override
	public int compareTo(Manga other) {
		return this.title.compareTo(other.title);
	}
}