package collections.set.hashset.custom;

import java.util.Objects;

// Implements Comparable so we can sort it later
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

	public String getAuthor() {
		return author;
	}

	public int getTotalChapters() {
		return totalChapters;
	}

	public int getTotalVolumes() {
		return totalVolumes;
	}

	@Override
	public String toString() {
		return String.format("%-20s | %-10s | %d Ch | %d Vols", title, author, totalChapters, totalVolumes);
	}

	// --- REQUIRED FOR SETS (Uniqueness) ---
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

	// --- REQUIRED FOR SORTING (Comparable) ---
	// Default Sort: Alphabetical by Title
	@Override
	public int compareTo(Manga other) {
		return this.title.compareTo(other.title);
	}
}