package collections.map.hashmap.custom;

import java.util.Objects;

public class Manga {
	private String title;
	private String author;
	private String publisher;
	private boolean isAdapted; // Anime adaptation?
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

	// Getters (Essential for Sorting and Filtering)
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
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

	@Override
	public String toString() {
		return String.format("Title: %-20s | Author: %-10s | Vol: %-3d | Status: %s", title, author, totalVolumes,
				isComplete ? "Complete" : "Ongoing");
	}

	// Best Practice: Even though we use ISBN as the Key in the Map,
	// it is good practice to implement equals/hashCode for the Value object too.
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
}