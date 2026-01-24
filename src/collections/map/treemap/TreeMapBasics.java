package collections.map.treemap;

import java.util.TreeMap;

public class TreeMapBasics {

	public static void main(String[] args) {

		/*
		 * TreeMap characteristics: - Stores data as Key → Value pairs - Automatically
		 * sorts entries based on KEY - Sorting is done using: 1. Natural ordering
		 * (Comparable), OR 2. Custom Comparator - Does NOT allow null keys - Allows
		 * multiple null values - Backed by Red-Black Tree
		 */

		TreeMap<Integer, String> rankMap = new TreeMap<>();

		// 1. put() – Insertion order does NOT matter
		rankMap.put(1100, "One Piece");
		rankMap.put(700, "Naruto");
		rankMap.put(686, "Bleach");
		rankMap.put(139, "Attack on Titan");

		// Duplicate key replaces value
		rankMap.put(700, "Naruto Shippuden");

		// 2. Automatic Sorting by Key (Ascending)
		System.out.println("Sorted Map: " + rankMap);

		// 3. Basic Navigation
		System.out.println("First Key (Lowest): " + rankMap.firstKey());
		System.out.println("Last Key (Highest): " + rankMap.lastKey());

		// 4. Retrieve values using keys
		System.out.println("Manga with 686 chapters: " + rankMap.get(686));

		// 5. Size & Empty
		System.out.println("Size: " + rankMap.size());
		System.out.println("Is Empty? " + rankMap.isEmpty());
	}
}
