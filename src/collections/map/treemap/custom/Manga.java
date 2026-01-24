package collections.map.treemap.custom;

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

	// Getters
	public String getTitle() {
		return title;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getTotalChapters() {
		return totalChapters;
	}

	public boolean isComplete() {
		return isComplete;
	}

	// Comparable: Defines "Natural Order" (Alphabetical by Title)
	@Override
	public int compareTo(Manga other) {
		return this.title.compareTo(other.title);
	}

	@Override
	public String toString() {
		return String.format("%-20s | %-10s | %d Ch | %s", title, author, totalChapters,
				isComplete ? "Complete" : "Ongoing");
	}

	// Identity (Good practice for Value objects)
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Manga manga = (Manga) o;
		return Objects.equals(title, manga.title);
	}

	@Override
	public int hashCode() {
		return Objects.hash(title);
	}
}